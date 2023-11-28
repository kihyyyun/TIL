package d4prob;

import java.util.Scanner;

public class H1 {
    //## 메서드 연습문제
    //
    //### H1
    //
    //미세먼지 수치를 입력받고,
    //0 ~ 30 이면 "좋음"
    //31 ~ 80 이면 "보통"
    //80 ~ 150 이면 "나쁨"
    //151 ~ 이면 "매우 나쁨"
    //이라는 문자열을 반환하는 메서드를 작성하시오.
    //

    public static int dustcheck (int dust){
        if( dust <=30){
            System.out.println("좋음");
        } else if ( dust <80) {
            System.out.println("보통");
        } else if ( dust < 150){
            System.out.println("나쁨");
        }else {
            System.out.println("매우 나쁨");
        }
        return dust;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int dust =scanner.nextInt();
        dustcheck(dust);
    }






    //### H6
    //
    //원반을 끼울 수 있는 탑 3개에,
    //다양한 크기의 원반 n개가, 큰것이 아래쪽에 위치하도록
    //하나의 탑에 끼워져 있다.
    //이 원반은 옮길 수 있는데,
    //
    //1. 한번에 하나의 원반만을 옮길 수 있으며,
    //2. 작은 원반 위에 큰 원반이 잠시라도 올라가서는 안된다.
    //
    //라는 조건을 지키면서 모든 원반을 한 탑에서 다른 탑으로 이동하는 문제를
    //하노이의 탑이라 부른다.
    //한 탑에서 원반을 하나 꺼내 다른 탑으로 옮긴 횟수를 센다고 했을 때,
    //n개의 원반을 총 몇번 옮겨야 하는지를 구하는 메서드를 작성하시오.
    //
    //-------
    //
    //1, 2번은 예전에 했던 내용을 메서드로 변환하는 문제입니다...!
}
