package kama;

import java.util.Scanner;

class kama15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
           int n = sc.nextInt();
           sc.nextLine();
           while(n-- > 0){
               String a = sc.nextLine();
               String b = sc.nextLine();
               StringBuilder sb = new StringBuilder(a);
               sb.insert(a.length()/2, b);
               System.out.println(sb.toString());
           }
        }
    }
}