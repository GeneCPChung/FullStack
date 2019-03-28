package abstractionLesson;

import abstractionLesson.AnotherPerson;

public class Vegan extends AnotherPerson {

    @Override
    public void eat() {
        System.out.println("Eats vegan food");
    }
}
