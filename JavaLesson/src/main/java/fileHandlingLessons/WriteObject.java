package fileHandlingLessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("bike", 9444);
        Vehicle car = new Vehicle("Car", 4268);

        try (FileOutputStream fos = new FileOutputStream("JavaLesson\\vehicles.dat")) {
            try (ObjectOutputStream obj = new ObjectOutputStream(fos)){
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("Object written onto file");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occured");
        }

    }
}
