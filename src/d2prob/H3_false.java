package d2prob;

import java.util.Scanner;

public class H3_false {
    public static void main(String[] args) {
        //H3
        //ASCII 코드로 'A'는 65이다.
        //1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.




















        Scanner scanner = new Scanner(System.in);
        System.out.println("1~26사이의 숫자를 입력하세요: ");
        int n = scanner.nextInt();
//        char ch =(char)n;
//        System.out.println(ch);
        //'A' == 65이고, n==1일때 출력이 'A')
        System.out.println((char) (64+n) );
    }
}
