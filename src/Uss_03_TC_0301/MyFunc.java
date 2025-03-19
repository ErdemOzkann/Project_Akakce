package Uss_03_TC_0301;

public class MyFunc {
    public static void bekle(int sayiye){

        try {
            Thread.sleep(sayiye*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

}
