package d4prob;

public class H3 {
    //### H3
    //
    //사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
    //두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
    //반환하는 메서드를 작성하시오.
    //단, 정수 범위에서만 결과를 반환합니다.
    //

    public static int plus(char operator, int num1, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        return operator;
    }

    public static void main(String[] args) {
        System.out.println(plus('*', 15, 6));
    }
}