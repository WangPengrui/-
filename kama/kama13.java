package kama;

import java.util.Scanner;

public class kama13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isfirst = true;
        while (sc.hasNext()) {
            String c = sc.next();
            if(c.equals("@"))    break;
            int n = sc.nextInt();
            if(!isfirst){
                System.out.println();
                System.out.println();
            }
            isfirst = false;
            // 打印第一行
            if(n > 1)   print(c, n-1, true);
            else print(c, n-1, false);
            // 打印中间行
            for(int i = 2; i < n; i++){
                print(c, n-i, false);
                print(c, (i-1)*2-1, true);
            }
            // 打印最后一行
            if(n > 1){
                for(int i = 0; i < 2*n-1; i++){
                    System.out.print(c);
                }
            }
        }
    }
    public static void print(String c, int blank, boolean isln) {
        for (int i = 0; i < blank; i++) {
            System.out.print(" ");
        }
        System.out.print(c);
        if(isln){
            System.out.println();
        }
    }
}