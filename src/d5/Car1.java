package d5;

public class Car1 {
    // 총 도로를 달리고 있는 자동차의 갯수
    // 정적 속성: 객체 각각이 아닌 클래스가 가지고 있는 속성
    private static int count = 0;
    private String brand;
    private String name;
    private int fuel;

    // 생성자: 객체를 만들때 호출되는 메서드
    public Car1() {
        count++;
        this.name = "Sonata";
        this.brand = "Hyundai";
        this.fuel = 72;
    }

    public Car1(String name, String brand, int fuel) {
        count++;
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
    }

    public static int getCount() {
        return count;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // 경적을 울리는 기능
    public void beep() {
        System.out.println("빠아아아앙");
    }

    // 가진 정보를 출력하는 기능
    public void printInfo() {
        System.out.println(String.format("name:\t%s", name));
        System.out.println(String.format("brand:\t%s", brand));
        System.out.println(String.format("fuel:\t%d", fuel));
    }

    // 특정 거리를 이동하는 기능
    public void drive(int kilo) {
        fuel -= kilo / 2;
        System.out.println(
                String.format("Moved: %d km, Fuel: %d", kilo, fuel));
    }
}