package static2;

import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instancCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instancCall();

        System.out.println("4.파라미터로 인스턴스 객체 주입");
        DecoData data3 = new DecoData();
        staticCall(data3);

        DecoData data4 = new DecoData();
        data4.staticCall();

        staticCall();
    }
}
