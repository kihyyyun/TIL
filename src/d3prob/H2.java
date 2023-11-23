package d3prob;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        //
        //
        //H2
        //축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
        //남은 경기와 목표 승점이 주어졌을 때,
        //남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
        //없으면 최고 승점을 출력하여라.
        //


        Scanner scanner = new Scanner(System.in);
        int remaining = scanner.nextInt();
        int current = scanner.nextInt();
        int goal = scanner.nextInt();

        //넘을 수 있냐를 판단하기 위해 전부 이겼다고 가정
        int maxScore = current + remaining * 3;
        if (maxScore >= goal) {
            //승 한번이 무승부로 바뀌면 최고점에서 몇점이 줄어들어들까요? 2점
            //최고 점수 - 목표 점수 = 여유분 점수
            //여유분 점수를 2로 나눈 몫만큼 덜 이겨도
            //나머지를 다 무승부로 끝내면 필요한 최소 승수
            int minWins = remaining - (maxScore - goal) / 2;
            //필요 승수가 음수가 될경우 0으로 바꿔주는 삼항연산1
            minWins =minWins <0 ? 0 : minWins;
            System.out.println(String.format("최소 필요 승수 : %d", minWins));
        } else {
            System.out.println(String.format("최대 승점: %d", maxScore));
        }


//        int 현재승점 =15;
//        int 목표승점 =25;
//        int 남은경기 =5;
//
//        int 최대승점 = 현재승점 + 남은경기*3;
//
//        if (최대승점 < 목표승점){
//            System.out.println("목표 승점을 달성할 수 없습니다. 가능한 최대 승점은 " +최대승점+ "입니다");
//        } else {
//            int 최소승수 =(목표승점 -현재승점 +2) /3;
//            System.out.println(최소승수);
    }
}

