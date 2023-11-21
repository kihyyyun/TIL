package d1prob;

import java.util.Scanner;

public class Q5VarAndTypes {
    public static void main(String[] args) {
        //Q5
//사용자에게 3개의 0.0 ~ 4.5 사이의 실수를 입력받고
//그 뒤에 3개의 이름을 입력받은 뒤
//이름 - <이름>, 학점 - <실수>
//의 형태로 3줄을 출력하는 프로그램을 작성하시오. 단, 실수의 범위가 틀려도 상관없다. (수정됨)
        double[] scores =new double[3];
        String[] names = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("3개의 0.0~4.5 사이의 실수를 입력하세요");
        scores [0] = scanner.nextDouble();
        scores [1] = scanner.nextDouble();
        scores [2] = scanner.nextDouble();

        System.out.println("이름 3번");
        names[0] = scanner.next();
        names[1] = scanner.next();
        names[2] = scanner.next();

        //출력템플릿

        String template ="이름 - %s, 학점 -%f";
        System.out.println(String.format(template, names[0], scores[0]));
        System.out.println(String.format(template, names[1], scores[1]));
        System.out.println(String.format(template, names[2], scores[2]));


        System.out.println("이름 - "+"<"+names[0]+">,"+"학점 - "+"<"+scores [0]+">");
        System.out.println("이름 - "+"<"+names[1]+">,"+"학점 - "+"<"+scores [1]+">");
        System.out.println("이름 - "+"<"+names[2]+">,"+"학점 - "+"<"+scores [2]+">");




    }
}
