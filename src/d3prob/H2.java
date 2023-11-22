package d3prob;

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

        int 현재승점 =15;
        int 목표승점 =25;
        int 남은경기 =5;

        int 최대승점 = 현재승점 + 남은경기*3;

        if (최대승점 < 목표승점){
            System.out.println("목표 승점을 달성할 수 없습니다. 가능한 최대 승점은 " +최대승점+ "입니다");
        } else {
            int 최소승수 =(목표승점 -현재승점 +2) /3;
            System.out.println(최소승수);
        }
    }
}
