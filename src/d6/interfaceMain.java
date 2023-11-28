package d6;

public class interfaceMain {
    public static void main(String[] args) {
        Car car =new Car();
        makeNoise(car);
    }


    public static void makeNoise(Beeper beeper){
        beeper.beep();
    }
}
