package d2prob;

import java.util.Scanner;

public class Q1Operators {
    public static void main(String[] args) {
//        세과목의 시험점수 (int)가 입력될 때,
//                평균 점수 (double)를 구하여라
        Scanner scanner = new  Scanner(System.in);

        int[] grade = new int[3];

        grade[0] = scanner.nextInt();
        grade[1] = scanner.nextInt();
        grade[2] = scanner.nextInt();

        System.out.println((double) (grade[0]+grade[1]+grade[2]) / 3);































//
//        Scanner scanner = new Scanner(System.in);
//        int[] scores =new int[3];
//        scores[0] = scanner.nextInt();
//        scores[1] = scanner.nextInt();
//        scores[2] = scanner.nextInt();
//
//        System.out.println( (double) (scores[0] +scores[1]+ scores[2])/3 );

    }
}
