package d6.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(divide(a,b));
            System.out.println("Bye!");
        } catch (ArithmeticException e){
            System.out.println("Sorry, can't do that!");
        }
    }
    //두개의 정수를 받아 나누어서 정수 결과를 변환하는 정적 메서드 'divide'
    public static int divide(int a, int b){
       return a / b;
    }
}
