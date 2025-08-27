package javainflearn.polymorphism.ex.pay0;
import java.util.HashMap;
import java.util.Map;

public class SelectPay {

    private static final Map<String, Pay> payMap = new HashMap<>();

    // static 블록에서 미리 등록
    static {
        payMap.put("kakao", new KakaoPay());
        payMap.put("naver", new NaverPay());
        payMap.put("other", new OtherPay());
    }

    public static Pay select(String option) {
        // option에 해당하는 Pay가 없으면 DefaultPay 리턴
        return payMap.getOrDefault(option, new DefaultPay());
    }
}
