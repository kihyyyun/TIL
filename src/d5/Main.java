package d5;

public class Main {
    //    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        scanner.nextInt();
////        scanner.nextLine();
//        Car myCar = new Car();
//        Person person = new Person();
//
//
//
//        person.age = 28;
//        person.name = "김형도";
//        person.gender = "??";
//        person.hello("김형도");
//
//
////        myCar.count +=1;
//        Car.count += 1;
//        myCar.plate ="31서4822";
//        myCar.brand ="kia";
//        myCar.name = "k5";
//        myCar.fuel = 72;
//        myCar.beep();
//        myCar.printInfo();
//        myCar.drive(10);
//        System.out.println(Car.count);
//
//        Car car =new Car();
//        Car.count += 1;
//        car.brand = "Hyundai";
//        car.name = "Sonata";
//        car.fuel =80;
//        car.printInfo();
//
//        System.out.println(Car.count);
//
//
//        Car someCar =new Car();
//        Car.count += 1;
//
//        someCar.name ="K3";
//        someCar.brand = "kia";
//        someCar.fuel = 60;
//        someCar.printInfo();
//
//
//        ////???????????
//        someCar.brand ="Mercedes-Benz";
//        someCar.name = "E-Class";
//        someCar.printInfo();
//}
    public static void main(String[] args) {
        Car1 someCar = new Car1();
//        someCar.name = "K5";
//        someCar.brand = "Kia";
//        someCar.fuel = 72;
        System.out.println(someCar.getBrand());
        someCar.setFuel(100);
        someCar.printInfo();

        Person me =new Person("Jeeho Park");
        for(int i = 0; i<40; i++){
            me.age();
        }
        System.out.println(me.getAge());
        me.hello();

//        // ????
//        someCar.name = "E-Class";
//        someCar.brand = "Mercedes-Benz";
//        someCar.printInfo();
        int a =10;
        int b =20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }

    public static void swap(int a, int b){
        int tmp =a;
        a= b;
        b= tmp;
    }
}
