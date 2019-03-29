package comparableLessons;

import java.util.*;



class Names implements Comparable<Names>{
    private String name;

    public Names(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Names obj) {
        if(name.length() == obj.name.length()){
            return 0;
        }else if (name.length() < obj.name.length()){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ComparableLesson {
    public static void main(String[] args) {
       /* List<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Russia");
        ComparableLesson app = new ComparableLesson();
        app.printList(countries);
        System.out.println("*********************");
        Collections.sort(countries);
        app.printList(countries);*/

        List<Object> elements = new LinkedList<>();
        elements.add(new Names("Chaand"));
        elements.add(new Names("Curly"));
        elements.add(new Names("Larry"));
        elements.add(new Names("Moe"));
        elements.add("Some String");
        elements.add(1);
        elements.add(2.0);
        elements.add("#");

        ComparableLesson app = new ComparableLesson();
        app.printList(elements);

      /*  Collections.sort(elements);
        System.out.println("*****************");
        app.printList(elements);*/
    }

    void printList(List<Object> list){

        ListIterator<Object> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }
    }
}
