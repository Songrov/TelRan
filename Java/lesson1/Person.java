package telran.homework.lesson1;

public class Person {

    private static String fullName;
    private int age;


    public Person() {

    }

    public void move() {
        System.out.println("Person " + fullName + " is move");
    }

    public void talk() {
        System.out.println("Person " + fullName + " is talk");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



        public static void main(String[] args) {
            Person person = new Person();


            System.out.println("Person " + fullName + " is move");
            System.out.println("Person " + fullName + " is talk");


        }


    }




