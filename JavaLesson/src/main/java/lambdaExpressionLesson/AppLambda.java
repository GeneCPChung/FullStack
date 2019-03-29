package lambdaExpressionLesson;

// interface Lambda {public void demo();}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
    private String name;
    public Data(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}


public class AppLambda {
    public static void main(String[] args) {
        /*Lambda lambda = ()-> {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
        };
        lambda.demo();*/
       /* new Thread(()->{
            System.out.println("I am inside thread 1");
            System.out.println("I am inside thread 2");
        }).start();
        */

        List<Data> list = new ArrayList<>();
        list.add(new Data("Chaand"));
        list.add(new Data("Ed"));
        list.add(new Data("Curly"));
        list.add(new Data("Larry"));
        list.add(new Data("Moe"));

       /* Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(list, (Data o1, Data o2)-> o1.getName().compareTo(o2.getName()));

        for(Data data : list ){
            System.out.println(data.getName());
        }







    }

  }
