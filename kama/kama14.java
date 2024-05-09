package kama;

import java.util.Scanner;

public class kama14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            sc.nextLine();  // 移动光标到下一行
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                String[] lineArr = line.split(" ");
                for(String s : lineArr){
                    if(s == null || s.length() == 0)   continue;
                    char c = s.toUpperCase().charAt(0);
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}