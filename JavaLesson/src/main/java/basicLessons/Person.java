package basicLessons;

public class Person {
    private String name = "John";
    private int age = 25;
    private String gender = "Male";

    public Person() {
        this.name = "John Doe";
        this.age = 25;
        this.gender = "Male";
    }



    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "basicLessons.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
