package d3prob;

import java.util.Scanner;

public class Q2Contol {
    public static void main(String[] args) {
      //어떤 학생의 시험점수가 정수로 주어진다.
        //점수가 90점 이상이면 "수",
        //점수가 80점 이상 90점 미만이면 "우",
        //점수가 80점 미만이면 "미"
        //를 출력하여라.

        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if(grade>=90){
            System.out.println("수");
        } else if (grade>=80 && grade <90) {
            System.out.println("우");
        } else {
            System.out.println("미");
        }

        int zero = 0;
        if (zero == 0){
            System.out.println("is zero");
        }
        else if (10 % zero == 0){
            System.out.println("is factor");
        }
        else {
            System.out.println("not factor");
        }


    }
}
