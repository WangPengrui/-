package kama;

import java.util.*;
public class kama11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int N = sc.nextInt();
            Map<Integer, Integer> hash = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                hash.put(a, b);
            }
            int countMing = 0;
            int a = 1;
            while(hash.containsKey(a)){
                a = hash.get(a);
                countMing++;
            }
            int countYu = 0;
            int b = 2;
            while(hash.containsKey(b)){
                b = hash.get(b);
                countYu++;
            }
            if(countMing == countYu){
                System.out.println("You are my brother");
            }else if(countMing > countYu){
                System.out.println("You are my elder");
            }else{
                System.out.println("You are my younger");
            }
        }
    }
}