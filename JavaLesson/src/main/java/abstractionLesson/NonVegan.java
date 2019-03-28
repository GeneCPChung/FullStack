package abstractionLesson;

public class NonVegan extends AnotherPerson {
    @Override
    public void eat() {
        System.out.println("Eats non-vegan food");
    }
}
