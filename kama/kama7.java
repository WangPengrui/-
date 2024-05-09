package kama;

import java.util.Scanner;

public class kama7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String grade = sc.nextLine();
            String[] gradeArr = grade.split(" ");
            double sum = 0;
            boolean isUnknown = false;
            for (int i = 0; i < gradeArr.length; i++) {
                switch (gradeArr[i]){
                    case "A":
                        sum += 4;
                        continue;
                    case "B":
                        sum += 3;
                        continue;
                    case "C":
                        sum += 2;
                        continue;
                    case "D":
                        sum += 1;
                        continue;
                    case "F":
                        continue;
                    default:
                        isUnknown = true;
                        break;
                }
            }
            if(isUnknown) System.out.println("Unknown");
            else System.out.printf("%.2f\n", sum / gradeArr.length);
        }
        sc.close();
    }
}

/*
public class kama7 {
    public static void main(String[] args) {
        kama7 k7 = new kama7();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int sum = 0;
            double n = 0.0;
            boolean flag = true;
            for (char c : line.toCharArray()) {
                if (c == ' ') continue;
                if (!k7.isValid(c)) {
                    System.out.println("Unknown");
                    flag = false;
                    break;
                }
                if(c == 'F'){
                    n++;
                    continue;
                }
                sum += Math.abs(c - 'F' + 1);
                n++;
            }
            if(flag){
                double res = sum / n;
                System.out.printf("%.2f", res);
                System.out.println();
            }
        }
    }

    public boolean isValid(char c) {
        if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'F')   return true;
        return false;
    }
}
*/