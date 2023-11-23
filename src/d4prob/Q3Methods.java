package d4prob;


/*
피보나치 수열은
F(0) = 0
F(1) = 1
F(2) = 1
F(n) = F(n-1) + F(n-2)
인 수의 나열이다.
음이 아닌 정수 n을 인자로 받아 n번째 피보나치 수를 반환하는 메서드를 구현하시오.
* */

import java.util.Scanner;

public class Q3Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fivo(number));
    }
    public static int fivo(int n){
//        if(n==0){
//            return 0;
//        } else if (n==1) {
//            return  1;
        if( n==0 ||n==1) return n;
         else if (n==2) return 1;
         else return fivo(n-1)+fivo(n-2);
    }
}
