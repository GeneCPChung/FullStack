package basics;

public class Hello {
    public static void main(String[] args) {
        Person john = new Person();
        System.out.println(john);
        Person pooja = new Person("Pooja", 26, "Female");
        System.out.println(pooja);
        pooja.setAge(46);
    }
}
