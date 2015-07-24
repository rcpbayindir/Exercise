package Generic_Classes;

import Generic_Classes.List;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class ListDriver {
    public static void main(String args[]){
        List<String> glist=new List<String>(10);
        glist.add("milk");
        glist.add("eggs");
        System.out.println("Grocery list: "+ glist.toString());
        List<Integer> numbers=new List<Integer>(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("Grocery list: "+ numbers.toString());

    }
}
