package d1prob;

import java.util.Scanner;

public class Q1VarAndTypes {
    public static void main(String[] args) {
        //Q1
        //사용자에게 입력을 받고,
        //동일한 내용을 세번 출력하는 코드를 작성하시오.
        Scanner scanner = new Scanner(System.in);
        // 사용자의 입력을 변수로 저장한다.
        String scannedLine = scanner.nextLine();
        //동일한 변수 3번을 출력한다.
        System.out.println(scannedLine);
        System.out.println(scannedLine);
        System.out.println(scannedLine);



    }
}
