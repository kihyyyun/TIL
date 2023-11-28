package d4prob;

public class H6 {

    public static int hanoi(int n){
        //n <1 = -1
        if(n< 1) return 0;
        //f(1) == 1
        if(n ==1) return 1;
        else return  hanoi(n-1) *2 +1;
    }

    public static void main(String[] args) {
        System.out.println((hanoi(5)));
    }
}
