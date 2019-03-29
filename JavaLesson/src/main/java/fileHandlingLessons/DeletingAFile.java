package fileHandlingLessons;

import java.io.File;

public class DeletingAFile
{
    public static void main(String[] args) {
        File file = new File("team.txt");
        if (file.delete()){
            System.out.println("Deletion Successful");

        }else{
            System.out.println("Something bad happened");
        }
    }
}
