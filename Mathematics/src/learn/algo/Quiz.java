package learn.algo;

import java.util.ArrayList;

public class Quiz {
    public static void BlackDividesRed(){
        int count = 0;
        for (int i = 1; i<=6; i++){
            for (int j = 1; j<=6; j++){
                if (i%j == 0){
                    System.out.println(i+ "/"+j);
                    count++;
                }
            }
        }
        System.out.println(count+"/36");
    }

    public static void BlackMultipleOfRed(){
        int count = 0;
        for (int i = 1; i<=6; i++){
            for (int j = 1; j<=6; j++){
                if (j%i == 0){
                    System.out.println(j+ "="+i+"*"+j/i);
                    count++;
                }
            }
        }
        System.out.println(count+"/36");
    }

    public static int moduloPower2(int a, int b, int m){
        int p = 2;
        int temp = a;
        while (p <= b){
            temp = (temp * temp)%m;
            p = p*2;
        }

        return temp;
    }

    public static ArrayList<Integer> NumberToPowers2(int n){
        String binary = "";
        ArrayList<Integer> powers = new ArrayList<Integer>();
        int power = 0;
        while (n > 0){
            if(n%2 == 0){
                binary = "0"+binary;
            }
            else {
                binary = "1"+binary;
                powers.add((int)Math.pow(2,power));
            }
            n = n/2;
            power++;
        }

            return powers;

    }
}
