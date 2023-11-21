package d2prob;

import java.util.Scanner;
import java.util.SortedMap;

public class H2 {
    public static void main(String[] args) {
        //H2
        //어떤 수 A와 B가 입력된다..
        //A를 B로 나눈 몫과 나머지를, "A = 몫 * B + 나머지"의 형태로 출력하여라.
        //예) A = 10, B = 3가 입력될때,
        //A = 3 * B + 1
        Scanner scanner =new Scanner(System.in);

        System.out.println("A를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.println("B를 입력하세요 : ");
        int b = scanner.nextInt();

        int 몫 = a / 3;
        int result = a % b;
        System.out.println("A = "+ 몫 + " * " +b + " + " + result );
    }



}
