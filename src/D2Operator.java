import java.util.Scanner;

public class D2Operator {
    public static void main(String[] args) {
        int plus = 10 * 20;
        int minus = 20 * 10;
        int multiply =20 * 10;
        int divide =20 /10;
        int modulo = 15 % 10;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        //사칙연산의 우선순위
        int result = 10 + 5 *3;
        System.out.println(result);

        //괄호가 최우선
        result= (10 +5) * 3;
        System.out.println(result);

        // %의 우선순위는?
        result =(10 + 5 % 3) / 3+2 *3;
        System.out.println(result);


        System.out.println(21/10); // 2

        // 1. 데이터를 받는 애를 int가 아니라 double로 해보자.
        double doubleDivide =21/10;
        System.out.println(doubleDivide);

        //2. 나누기 전에 실수로 만들어 주자.
        //피연산자 중 하나라도 double이면 결과도 double
        doubleDivide = 21 / 10.0;
        System.out.println(doubleDivide);

        //피연산자 둘다 정수 변수면?
        // 형변환 (Type Casting)
        int intResult = (int) 2.1 +3;
        System.out.println(intResult);

        // 선 변환을 통한 나누기 연산
        int left = 21;
        int right = 10;
        double castedResult =(double) left / right;
        System.out.println(castedResult);


        // 명시적 형변환 데이터 손실
        long bigInt = 4294967296L;
        System.out.println((int)bigInt);

        // char 형 변환
        int asciia = 65;
        System.out.println((char) asciia);
        System.out.println((char)( asciia +10 ));

        // String 덧셈
        // String Concatenation
        System.out.println("여기에 10을 입력하시오: " + 10);
        System.out.println(10 + " + " + 10 + " = " + 20);
        String formula = 10 + " + "  + 10+ " = " + 20;

        char largeA = 'A';
        char ten = 10;
        System.out.println((char) (largeA+ ten));



        int count =0;
        count++;
        System.out.println("현재횟수 : " +count);
        count++;
        System.out.println("현재횟수 : " +count);
        count--;
        System.out.println("현재횟수 : " +count);
        ++count;
        --count;
        System.out.println("최종: " + count);

        count = 10;
        System.out.println(++count); //11 (출력 전에 1 증가 = 11)
        System.out.println(count++); //11 (출력 후에 1 증가 = 12)
        System.out.println(--count); //11 (출력 전에 1 감소  =11)
        System.out.println(count--); //11 (출력 후에 1 감소 = 10)

        int addTo = 1;
        addTo += 10;     // 11
        addTo *= addTo;  // 121

        addTo /= 12;  // addTo = addTo / 12;
        addTo %= 10;  // addTo = addTo % 10;
        addTo -= 20;  // addTo = addTo - 20;
        addTo *= -1;  // addTo = addTo * -1;

        System.out.println(addTo);

        //비교 연산자
        int small1 =10;
        int small2 =10;
        int big = 21;
        double bigD = 21.0;
        System.out.println(small1 ==small2);
        System.out.println(big == small1);
        System.out.println(big == bigD);
        System.out.println(small1> small2);
        System.out.println(small1>=small2);
        System.out.println(small1 != small2);
        System.out.println(small1 <= small2);
        System.out.println(small2< bigD);


        // 비트 연산자
        // 11 = 0000 1011
        //  5 = 0000 0101
        // 비트연산 AND (&)
        System.out.println(11 & 5);
        // 비트연산 OR (I) (SHIFT +\)

        System.out.println(11 | 5);

        //비트연산 XOR (^)
        System.out.println(11 ^ 5);
        //비트연산 NOT (~)
        System.out.println(~11);
        System.out.println(~5);

        //SHIFT 연산
        System.out.println(12 << 2);
        System.out.println(12 << 1);
        System.out.println(-12 >> 1);
        System.out.println(-12 >>> 1);

        // int a가 짝수일 때 a & 1은 0
        //<< == * 2, >> /2
        //~a = -a -1

    //삼항 연산자
        int temperature = 38;
        String message = temperature < 38 ? "ok" : "Feverish";
        // (boolean) ? (참일때결과) :(거짓일때결과)

        //
    }
}
