package collections;
import java.util.*;

public class ListDemo {
    public static void main(String args[])
    {
        List<String> L = new ArrayList<>();
        L.add("Java");
        L.add("C++");
        L.add("Python");
        L.add("R");
        L.add("Scala");
        L.add("Java");



        System.out.println("Element at 0 position: "+L.get(0));

        for(String s:L)
        {
            System.out.println(s);
        }

        System.out.println("After deleting an element");

        L.remove(0);
        /*

        for(String s:L)
        {
            System.out.println(s);
        }

         */
        Iterator<String> i = L.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }



    }
}
