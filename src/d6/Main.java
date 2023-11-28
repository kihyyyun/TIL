package d6;

public class Main {
    public static void main(String[] args) {
        Car sonata = new Car();
        refuel(sonata);
        System.out.println(sonata.getFuel());
        sonata.drive(100);
        sonata.beep();

        Truck poter = new Truck(100);
        refuel(poter);
        System.out.println(poter.getFuel());
        poter.drive(100);
        poter.beep();
        poter.addload(30);
        System.out.println(String.format(
                "max load: %d, current load: %d",
                poter.getLoad(),poter.getMaxLoad())
        );

        Car bongo = new Truck(100);
        ((Truck) bongo).addload(10);
        if(isTruck(sonata))
            ((Truck) sonata).addload(10);
        else System.out.println("is not Truck");


        poter.drive(30);

        refuel(bongo);
        bongo.drive(100);
    }
    public static boolean isTruck(Car car){
        return car instanceof Truck;
    }


    public static void refuel(Car car){

        car.setFuel(100);
    }
}
