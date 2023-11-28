package d6;


    public class Student extends Person{
        private  String major;

        public Student(String name, String major){
            super(name);
            this.major =major;
        }

        public void sayHello(){
            System.out.println(String.format(
                    "Hello, I'm %s, and studying %s!",
                    getName(), major
            ));
        }
    }

