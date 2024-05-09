package kama;

import java.util.*;
public class kama4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int N = in.nextInt();
            if(N == 0)  break;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
