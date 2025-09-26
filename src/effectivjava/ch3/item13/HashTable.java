package effectivjava.ch3.item13;

import java.util.Map;

public class HashTable implements Cloneable {
    private Entry [] buckets ;

    private static class Entry{
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
        // 깊은복사 .1 (자신이 가리키는 연결 리스트 전체를 복사하기 위해 자신을 재귀적 호출. 리스트의 원소 수 만큼 스택 프레임 소비..)
        Entry deepCopy(){
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }

        //깊은복사 .2  엔트리 자신이 가리키는 연결리스트를 반복적 복사.
        Entry deeCopy2(){
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key, p.next.value, p.next);
            }
            return  result;
        }
    }
        // 얕은복사 clone
//    @Override
//    public HashTable clone(){
//        try {
//            HashTable result = (HashTable) super.clone();
//            result.buckets = buckets.clone();
//            return result;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


    @Override
    public HashTable clone(){
        try{
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];
            for(int i=0; i<buckets.length; i++) {
                if(buckets[i] !=null)
                    result.buckets[i] = buckets[i].deepCopy();
            }
            return result;
        }catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
