package kama;

import java.util.*;

public class kama10 {
    private int res;

    public static void main(String[] args) {
        kama10 solution = new kama10();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            if (M == 0 && N == 0)
                break;
            solution.res = 0; // 每次处理新的输入时重置结果
            solution.calculateDays(M, N);
            System.out.println(solution.res);
        }
        sc.close();
    }

    private void calculateDays(int m, int n) {
        if (m < n) {
            res += m; // 如果物品数量小于n，直接加上剩余的数量
            return;
        }

        int freeM = m / n;
        int addDays = n * freeM;
        int remainM = freeM + m - addDays;
        res += addDays;

        calculateDays(remainM, n); // 递归调用处理剩余的物品数量
    }
}

/*
import java.util.*;

public class kama.Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            int M = in.nextInt(), K = in.nextInt();
            if(M == 0 && K == 0){
                break;
            }
            int day = M;
            while(M >= K){
                int keep = M / K;
                day += keep;
                M = keep + M % K;
            }
            System.out.println(day);
        }
    }
}
*/
