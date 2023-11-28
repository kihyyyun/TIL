package d6.object;

public class Main {

        public static void main(String[] args) {
//        Person alex = new Person("Alex", 25);
            Person alex = new Student();
            Person alex3 =new Lecturer(
                    "Alex",25,"korean"
            );
            int a = 0;
            // 수많은 계산이 진행된다.
            // 이후 int a가 얼마인지 확인하려면?
            System.out.println(a);
            // 그렇다면 alex에 어떤값이 있는지는
            // Getter를 쓰겠지만,
            System.out.println(alex);

            System.out.println(alex3.equals(alex3));

            //null
            Person noName =new Student();
            System.out.println(noName.getAge());
            System.out.println(noName.getName());
        }

    public static void  printPerson(){

    }
}
