package d2prob;

import java.util.Scanner;

public class Q4Operators {
    public static void main(String[] args) {
        /*
        두 정수 A와 B가 입력될 때,
        A의 세제곱이 B의 제곱보다 크만 true, 아니면 False를
        boolean 변수를 선언하지 않고 출력하여라.
         */

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a*a*a>b*b);



        int temperature =38;
        int age = 20;

        // 체온 37 이하
        boolean notSick = temperature <= 37;
        //나이는 20이상
        boolean isOfAge = age >=20;
        // 입장 가능 한가 ?
        boolean canEnter = notSick && isOfAge;
        System.out.println(canEnter);

        //일요일 이거나 공휴일이다.
        // 일요일 이다.
        boolean sunday = false;
        // 공휴일 이다.
        boolean holiday = false;
        //쉬는날이다.
        boolean canRest = sunday || holiday;
        System.out.println(canRest);


        //아니다.
        int number = 10;
        boolean isNegative =number < 10;
        boolean isNotnegative =!isNegative;
    }
}
