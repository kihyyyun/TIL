package d2prob;

import java.util.Scanner;

public class Q7Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        // 미세먼지 수치
        int dust = scanner.nextInt();
        // 80 이하면 "좋음", 아니면 "나쁨"

        message = dust >=80 ? "좋음" :"나쁨";
        System.out.println(String.format("미세먼지 수치: %d, (%s)",dust, message));
        System.out.println(message);
    }
}
