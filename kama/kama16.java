package kama;

import java.util.Scanner;

class kama16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            sc.nextLine();
            while(n-- > 0){
                String str = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < str.length(); i += 2){
                    sb.append(str.charAt(i+1));
                    sb.append(str.charAt(i));
                }
                System.out.println(sb.toString());
            }
        }
    }
}