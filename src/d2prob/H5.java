package d2prob;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        //H5
        //Scanner 이외의 변수를 한개만 선언하여
        //정수 A를 입력받아,

        //A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 A를 입력하세요 : ");
        long A = scanner.nextLong();

        System.out.println((A*A) % 10);
        System.out.println((A*A*A*A)% 10);
        System.out.println((A*A*A*A*A*A)% 10);
    }
}
