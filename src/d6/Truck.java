package d6;


//가장 먼저 자동차의 모든 기능을 가지게 만들자.
public class Truck extends Car {
    private final int maxLoad;

    private int load;

    public  Truck(int maxLoad){
        this.maxLoad = maxLoad;
        this.load = 0;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getLoad() {
        return load;
    }

    @Override
    public void drive(int kilos){
        System.out.println("drive truck");
        super.drive(kilos);

    }

    //짐을 인자로 받아 "maxLoad"이하면은 추가하고
    //아니면은 추가하지 않은 다음
    //추가 성공 여부를 boolean으로 반환하는 메서드
    public boolean addload(int load){
        if(this.load +load > this.maxLoad){
            return false;
        }else {
            this.load +=load;
            return true;
        }

    }
}
