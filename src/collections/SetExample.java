package collections;
import java.util.*;

public class SetExample {
    public static void main(String[] args)
    {
        Set<Object> s=new HashSet<Object>();
        // by default 10 elements, internally-- when 75% memory is occupied, it will double the memory
        s.add("java");
        s.add(1);

        Set<Object> s1=new LinkedHashSet<>();
        // by default 10 elements, internally-- when 75% memory is occupied, it will double the memory
        s1.add("java");
        s1.add(1);

        Set<String> s2=new TreeSet<>(Collections.reverseOrder());
        // by default 10 elements, internally-- when 75% memory is occupied, it will double the memory
        s2.add("java");
        s2.add("C++");

        /*

        for(Object o: s)
        {
            System.out.println(s);
        }

         */
        
        Iterator<Object> i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("--------LinkedSet----------");

        Iterator<Object> i1 = s1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }
        System.out.println("--------TreeSet----------");

        Iterator<String> i2 = s2.iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }


    }
}
