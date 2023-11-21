package d1prob;

import java.util.Scanner;

public class Q2VarAndTypes {
    public static void main(String[] args) {
        //Q2
        //두개의 숫자를 입력받고,
        //순서를 바꿔서 출력하시오
        //Scanner를 사용해 입력을 받는다 (* 2)
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstNumner = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int secondNumber = scanner.nextInt();

        System.out.println("순서를 바꿔서 출력합니다.");
        System.out.println(secondNumber);
        System.out.println(firstNumner);
    }
}
