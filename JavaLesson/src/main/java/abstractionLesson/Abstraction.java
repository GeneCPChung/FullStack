package abstractionLesson;

public class Abstraction {
    public static void main(String[] args) {

        AnotherPerson john = new Vegan();
        john.speak();
        john.eat();
        System.out.println("************************");
        AnotherPerson mia = new NonVegan();
        mia.speak();
        mia.eat();

    }
}
