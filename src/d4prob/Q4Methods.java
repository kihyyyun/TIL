package d4prob;

/*
int[],long[],double[]
 상기의 자료형에 대해서 동작하는 메서드를 같은 이름으로 만들어
 평균을 구하는 메서드를 만드시오.
 */
public class Q4Methods {
    public static int avg(int[] intNums){
        int sum = 0;
        for(int number : intNums){
            sum += number;
        }
        return  sum /intNums.length;
    }
    public static long avg(long[] intNums){
        long sum = 0;
        for(long number : intNums){
            sum += number;
        }
        return  sum /intNums.length;
    }
    public static double avg(double[] intNums){
        double sum = 0;
        for(double number : intNums){
            sum += number;
        }
        return  sum /intNums.length;
    }


    public static void main(String[] args) {
        int[] intNums ={1,2,3};
        long[] longNums ={2,4,6};
        double[] dobleNums ={1,3,5};
        System.out.println(avg(intNums));
        System.out.println(avg(longNums));
        System.out.println(avg(dobleNums));
    }
}
