package interfaceLesson;

import interfaceLesson.OnePlus5;
import interfaceLesson.Phone;

public class Interfaces {

    public static void main(String[] args) {
       Phone phone = new OnePlus5();
        System.out.println("Processor: " + phone.processor());
    }
}
