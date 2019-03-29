package fileHandlingLessons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\genec\\Desktop\\workspace\\FullStack\\JavaLesson");
        file.mkdir();
        file = new File("C:\\Users\\genec\\Desktop\\workspace\\FullStack\\JavaLesson\\team.txt");
        try {
            file.createNewFile();
            System.out.println("File created");
        }catch (IOException e){
            System.out.println("error occured, while creating the file");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.write("Chaand");
            bw.newLine();
            bw.write("Shabaz");
            bw.newLine();
            bw.write("Salim");
            bw.newLine();
            bw.write("Praful");
            bw.newLine();
            bw.write("Aarti");
            System.out.println("Writing onto the file completed");


        } catch (IOException e) {
            System.out.println("error occured, while creating the file");
        }

    }
}
