package kama;

import java.util.*;
public class kama9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int res = 0;
            while(n > 0){
                int temp = n%10;
                n /= 10;
                if(temp % 2 == 0)   res += temp;
            }
            System.out.println(res);
            System.out.println();
        }
    }
}

/*
public class kama9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String in = sc.nextLine();
            int sum = 0;
            for(int i = 0; i < in.length(); i++){
                if( (in.charAt(i)-'0') % 2 == 0 ){
                    sum += in.charAt(i)-'0';
                }
            }
            System.out.println(sum);
            System.out.println();
        }
        sc.close();
    }
}
*/
