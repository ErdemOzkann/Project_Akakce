package Uss_03.Utility;

public class MyFunc {
    public static void bekle(int sayiye){

        try {
            Thread.sleep(sayiye*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

}
