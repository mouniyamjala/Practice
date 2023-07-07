package collections;
import java.util.*;
import java.util.Collections.*;


public class MapExample {
    public static void main(String args[]) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Mouni");
        map.put(5, "Bhanu");
        map.put(3,"Gowtham");
        map.put(23, "Chaithu");

        map.put(0,"Sharu");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();//Entry is a nested class, inside of map
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

    }
}
