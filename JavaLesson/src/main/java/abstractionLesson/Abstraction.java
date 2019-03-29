package abstractionLesson;

public class Abstraction {
    public static void main(String[] args) {

        AnotherPerson john = new Vegan();
        john.breath();
        john.eat();
        john.speak();
        john.message();

    }
}
