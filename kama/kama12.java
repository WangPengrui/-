package kama;

import java.util.Scanner;

public class kama12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                print(n-i, i);
            }
            for (int i = n-1; i > 0; i--) {
                print(n-i, i);
            }
        }
    }
    public static void print(int blank, int n){
        for(int i = 0; i < blank; i++){
            System.out.print(' ');
        }
        for(int i = 1; i <= n; i++){
            System.out.print(i);
        }
        for(int i = n-1; i >0; i--){
            System.out.print(i);
        }
        System.out.println();
    }
}
