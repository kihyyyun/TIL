import java.util.Scanner;

public class D3ControlStatements {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // 나이를 입력받고, 나이가 20 미만일때 입자불가 출력
//        int age = scanner.nextInt();
//
//        if (age < 20) {
//            System.out.println("입장불가");
//            System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
//        }
//
//        int multiple = scanner.nextInt();
//        //multiple이 2의배수면, 2의 배수 출력
//        if (multiple % 2 == 0) {
//            System.out.println("2의 배수");
//        }
//        //multiple이 5의 배수면, 5의 배수 출력
//        if (multiple % 5 == 0) {
//            System.out.println("5의 배수");
//        }
//        //mutiple이 10의 배수면, 10의 배수 출력
//        if (multiple % 10 == 0) {
//            System.out.println("10의 배수");
//        }
//
//        //몇년인지 받는다.
//        int year = scanner.nextInt();
//        if (year % 4 == 0) {
//            scanner.nextInt();
//            String message = scanner.nextLine();
//            if (year % 100 != 0) {
//                System.out.println("윤년이다");
//            }
//            if (year % 400 == 0) {
//                System.out.println("윤년이다");
//            }
//        }
//        //어떤 학생의 시험점수가 입력 되었을 때,
//        // 80점을 넘으면 "Good Job"
//        // 못넘으면 "Too Bad"
//
//        int score = scanner.nextInt();
//        if (score > 80) {
//            System.out.println("good job");
//        } else {
//            System.out.println("Too Bad");
//        }
//        // 0 ~30: 좋음
//        // 31 ~80: 보통
//        // 80~150: 나쁨
//        // 151~: 매우나쁨
//
//        int dust = scanner.nextInt();
//        if (dust <= 30) {
//            System.out.println("좋음");
//        } else if (30 < dust && dust <= 80) {
//            System.out.println("보통");
//        } else if (80 < dust && dust <= 150) {
//            System.out.println("나쁨");
//        } else {
//            System.out.println("매우나쁨");
//        }
//
//        String input = scanner.nextLine();
//        // (확인하고 싶은 값)
//        switch (input) {
//            case "w":  // input == "w"
//                System.out.println("up");
//                break;
//            case "a":  // input == "a"
//                System.out.println("left");
//                break;
//            case "s":  // input == "s"
//                System.out.println("down");
//                break;
//            case "d":  // input == "d"
//                System.out.println("right");
//                break;
//            // 기본동작, 필수 아님
//            default:
//                System.out.println("invalid");
//                break;
//        }
//        //while
//       int loan = 1000;
//        int months = 0;
//        // 대출금 남았나?
//        while (loan > 0) {
//            loan -= 50;
//            loan *= 1.03;
//            months++;
//            System.out.println("남은 대출액" + loan);
//        }
//        System.out.println("대출 상환 완료! 총 걸린 개월수: "+ months);
//
//
//       while (i<numbers.length) {
//            System.out.println(numbers[i]);
//            sum += numbers[i];
//            i++;
//        }
//        System.out.println("총합 : "+sum);
//        System.out.println("평균 : "+sum/numbers.length);
//
//
        //for 문
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] numbers = {2,3,5,6,23,19};
        int sum = 0;
        int max = -100;
        for (int i =0; i < numbers.length; i++) {
            sum += numbers[i];
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("총합은 : "+sum);
        System.out.println("평균은 : "+sum/numbers.length);
        System.out.println(max);

        /*
        *
        **
        ***
        ****
        *****
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //foreach  몇번째인지 파악이 어렵다.
        String[] frulte = {"apple","pear", "banana"};
        for(String name : frulte){
            System.out.println(name);
        }

        // 같은 기능을 하는 for문
        for (int i = 0; i <frulte.length; i++){
            String name = frulte[i];
            System.out.println(name);
        }

        //반복문 제어
        int wallet =20000;
        int price = 5000;
        while (true){
            wallet -= 5000;
            if (wallet <=0) {
                System.out.println("돈 다 써서 더 못먹음ㅠㅠ");
                //그만먹자
                break;
            }
            System.out.println(String.format("1인분 먹고 %d 남음", wallet));
        }

        // numbers 내부에 19가 어디있는지
        // 있다면 그 위치를, 없다면 -1을 출력하도록
        numbers = new int[]{1, 3, 4, 11, 19, 21, 23};
        int target = -1;
        for(int i =0; i<numbers.length; i++){
            if(numbers[i] == 19){
                target = i;
                break;
            }
        }
        System.out.println(target);


        // continue
        // 0~ 9 사이의 짝수만 출력하고 싶다.
        System.out.println("contiune");
        for (int i = 0; i < 9; i++) {
            if(i % 2 !=0){
                continue;
            }
            System.out.println(i);
        }

        boolean[] vaccinated = {true, false, false, false, false, false, false, true, true};
        int groupCount = 0;
        for (boolean vaccine : vaccinated) {
            if (vaccine) {
                System.out.println("백신 맞으면 세지 않아요");
                continue;
            }

            groupCount++;
            // 일정 인원 이상이면 입장불가
            if (groupCount > 5) {
                System.out.println("입장이 불가합니다...");
                break;
            }
        }
    }
}
