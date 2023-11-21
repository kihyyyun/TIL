package d1prob;

import java.util.Scanner;

public class Q4VarAndTypes {
    public static void main(String[] args) {
        //        Q4
//        시간과 오전 오후를 입력받고,
//        오전 XX시
//        의 형식으로 출력하는 코드를 작성하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간과 오전or오후를 입력하세요 예: 2 오후 ");
        int timeint = scanner.nextInt();
        //nextLine : 남은 줄 전체
        //next: 다음 단어
        String timeString = scanner.next();

        System.out.println("예약 되었습니다 ");

        System.out.println(timeString + " " + timeint + "시");
    }
}
