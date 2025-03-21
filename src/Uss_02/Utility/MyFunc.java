package Uss_02.Utility;

public class MyFunc {

    public MyFunc() {
    }

    public static void Bekle(int saniye) {
        try {
            Thread.sleep((long)(saniye * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
