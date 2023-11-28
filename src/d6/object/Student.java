package d6.object;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }


    @Override
    public String toString(){
        return super.toString() + ", Student";
    }
}
