public class Person {
    //private means it can't be accessed from outside the object
    private String name;
    private int age;

    public Person(String name, int age) {
        //constructor
        //gets "this" parameter by default to diffrentiate between objects created from the same class
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hi! I'm " + name + " and I am " + age + " years old.");
    }
}
