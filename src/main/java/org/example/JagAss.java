package org.example;

public class JagAss {
    public String name = "Это жопный класс";

    public String minMaxAvg(){

        int mas1[];
        String res;
        mas1 = new int[25];

        int[] mas2 = {3, 1, 2, 4, 10, 5, 6, 7, 8, 9};
        int mi = mas2[0];
        int ma = mas2[0];
        double av = 0;

        for (int i=0;i<=9;i++){
            if(mas2[i]<mi){
                mi = mas2[i];
            }
            if(mas2[i]>ma){
                ma = mas2[i];
            }
            av += mas2[i];
        }
        av /=10;

//        System.out.println("min="+mi);
//        System.out.println("max="+ma);
//        System.out.println("avg="+av);
        res = "min="+mi + " max="+ma + " avg="+av;
        return res;
    }

    public static String returnStr(String name){
        return name + " казёл";
    }
}
