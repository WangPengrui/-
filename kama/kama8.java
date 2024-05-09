package kama;

import java.util.*;
public class kama8 {
    public static void main(String[] args) {
        kama8 solution = new kama8();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] height = new int[0];
        while(sc.hasNextInt()){
            n = sc.nextInt();
            if(n == 0)   break;
            height = new int[n];
            for (int i = 0; i < n; i++){
                height[i] = sc.nextInt();
            }
            int res = solution.flatten(n, height);
            System.out.println(res);
            System.out.println();
        }
        sc.close();
    }
    public int flatten (int n, int[] height){
        int sum = 0;
        for(int i : height){
            sum += i;
        }
        int avg = sum/n;
        int res = 0;
        for(int i : height){
            if(i < avg){
                res += avg - i;
            }
        }
        return res;
    }
}
