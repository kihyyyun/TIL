package d3prob;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        //H5
        //한 정수를 입력받는다.

        //이후 이 정수를 거듭제곱하며   1의 자리를 확인하면서,
        //몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
        //

        Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int 원래일의자리 = a%10;
       int 거듭제곱 = 0;

       while (true){
           a *= a;
           int 일의자리 = a%10;
           거듭제곱++;
           if(원래일의자리==일의자리){
               break;
           }
       }
        System.out.println(거듭제곱);

    }

}
