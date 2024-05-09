package kama;

import java.util.*;
public class kama2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            for (int i = 0; i < N; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a + b);
            }
            break;
        }
    }
}
