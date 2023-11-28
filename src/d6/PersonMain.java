package d6;

public class PersonMain {
    public static void main(String[] args) {
    Person alex =new Student("alex", "CSE");
    Person brad =new Student("Brad", "CSE");
    Person chad =new Lecturer("Chad", "CSE");


    alex.sayHello();
    brad.sayHello();
    chad.sayHello();

    Person[] people = {alex, brad, chad};
    for (Person person : people){
        person.sayHello();
    }



    }
}
