package d4prob;

import java.util.Scanner;

public class H2 {
    //### H2
    //
    //현재 오전 7시이다.
    //정수 n을 인자로 받아서,

    //n 시간 후 12시까지 표기된 시계에서
    //시침이 어떤 숫자 위에 있는지를 반환하는 메서드를 작성하시오.
    //단, 입력이 0 <= n <= 127 를 벗어나면 -1을 반환하시오.
    //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(timeAlert(scanner.nextInt()));

    }
    public static int timeAlert (int n) {
        int current = 7;
        int a = (current + n)% 12;
        if (!(0<= n && n < 127)){
            return -1;
        }else if(a == 0){
                a =12;
        }
        return a;
    }
}
