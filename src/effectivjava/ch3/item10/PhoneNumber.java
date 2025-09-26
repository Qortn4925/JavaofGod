package effectivjava.ch3.item10;

import java.util.Objects;

public final class PhoneNumber implements Cloneable {
    private final short areaCode , prefix, lineNum;
    private int hashCode=0;
    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자번호");

    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ":" + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;

        if(!(o instanceof  PhoneNumber)) return  false;

        PhoneNumber pn = (PhoneNumber) o;
        return  pn.lineNum == lineNum && pn.prefix ==prefix&&pn.areaCode ==areaCode;
    }

//    @Override
//    public int hashCode() {
//        int result = hashCode;
//        if(result ==0) {
//            result = Short.hashCode(areaCode);
//            result = 31 * result + Short.hashCode(prefix);
//            result = 31 * result + Short.hashCode(lineNum);
//        }
//        return result;
//    }

    // Object 클래스가 제공해주는 해쉬 함수 >> 더 느림. 성능에 민감하지 않을때사용
//    @Override
//    public int hashCode() {
//        return Objects.hash(areaCode, prefix, lineNum);
//    }

    // 해시코드를 지연 초기화하는 hashCode
    @Override public int hashCode(){
        int result= hashCode;
        if(result==0) {
            result = Short.hashCode(areaCode);
           result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode=result;
        }
        return  result;
    }

    // 모든 필드가 기본타입. 불변객체를 참조한다면
    @Override
    public PhoneNumber clone() {
        try{
            return (PhoneNumber)  super.clone();
        }catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNum=" + lineNum +
                ", hashCode=" + hashCode +
                '}';
    }
}
