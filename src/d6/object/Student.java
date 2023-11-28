package d6.object;

public class Student extends Person {
    private static final String name = "김기현";
    private static final String age = String.valueOf(28);

    private String major;

    public Student() {
        super(name, Integer.parseInt(age));
        this.major = major;
    }


    @Override
    public String toString(){
        return super.toString() + ", Student";
    }
}
