package d6;

public class Lecturer extends Person {
    private String title;

    public Lecturer(String name, String title) {
        super("text");
        this.title= title;
    }

    public void sayHello() {
        System.out.println(String.format("" +
                        "Hello! I'm %s, and teaching %s!"
                , getName(), title));
    }
}