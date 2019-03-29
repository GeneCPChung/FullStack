package collectionsLesson;

import java.util.ArrayList;

public class ArrayListLesson {

    static ArrayList<String> listNames = new ArrayList<>();
    public static void main(String[] args) {
        listNames.add("Chaand");
        listNames.add("John");
        listNames.add("Mary");
        listNames.add("Jane");
        listNames.add("Lucy");
        listNames.add("Curly");
        listNames.add("Larry");
        listNames.add("Moe");
        ArrayListLesson app = new ArrayListLesson();
        app.displayList(listNames);
        /*app.removeNameByPosition(0);
        System.out.println("**************");
        app.displayList(listNames);
        System.out.println("**************");
        System.out.println(listNames.get(0));
        System.out.println(listNames.get(1));
        System.out.println("**************");
        app.removeNameByString("Lucy");
        app.displayList(listNames);*/

        /*app.displayList(listNames);
        System.out.println("**************");
        app.modifyName(3, "Jessie");
        app.displayList(listNames);
        app.search("Larry");*/

        System.out.println("**************");
        int position = app.search("Larry");
        if(position != -1){
            app.modifyName(position, "Gary");
            app.displayList(listNames);
        }else {
            System.out.println("Invalid entry");
        }



    }

    void displayList(ArrayList<String> names){
        for(String name: names){
            System.out.println(name);
        }
    }

    void removeNameByPosition(int position){
        listNames.remove(position);
    }

    void removeNameByString(String name){
        listNames.remove(name);
    }

    void modifyName(int position, String newName){
        listNames.set(position, newName);
    }

    int search(String name){
       return listNames.indexOf(name);
    }
}
