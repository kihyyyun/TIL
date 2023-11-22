package d3prob;

import java.util.Scanner;

//정수 n이 입력한 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 할때,
//n개의 이름을 입력된 순서의 반대로 출력하여라.
public class Q4Contorl_Re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        //정수 입력 이후 개행 소모 용도
        scanner.nextLine();


        String[] names = new String[n]; //이름을 담을 저장소
        // n개의 이름 입력 받기
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        // 이 시점에서 모든 이름을 받은 상태이다.

        for (int i = 0; i< n; i++){
            // 0 ~ n -1 까지 n개 임으로,
            //제일 뒤에 있는에는 n - 1 에 있다.
            System.out.println(names[n -i -1]);
        }
    }
}
