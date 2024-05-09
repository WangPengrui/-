package kama;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class kama17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Deque<Integer> de = new LinkedList<>();
            int count = 0;
            for(int i = 1; i <= n; i++){
                de.offerFirst(i);
                while(!de.isEmpty() && arr[count] == de.peekFirst()){
                    de.pollFirst();
                    count++;
                }
            }
            System.out.println(count == n ? "Yes" : "No");
        }
    }
}