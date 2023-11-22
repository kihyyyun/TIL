package d2prob;

import java.util.Scanner;

public class H4 {
    //H4
    //두 정수 A와 B가 입력될 때,
    //A가 B로 나누어 떨어지는지를 true 또는 false로 출력하여라.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

//        boolean result = A % B == 0 ? true : false;
//
//        System.out.println(result);
        System.out.println(A % B == 0);
    }
}
