package kama;

import java.util.Scanner;

public class kama6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int N = sc.nextInt();
            while(N-- > 0){
                int sum = 0;
                int M = sc.nextInt();
                while(M-- > 0){
                    sum += sc.nextInt();
                }
                System.out.println(sum);
                if(N > 0)   System.out.println();
            }
        }
    }
}