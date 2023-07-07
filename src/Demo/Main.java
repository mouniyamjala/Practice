// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package Demo;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Institution i = new Institution();
        i.setAddress("technodeed");
        Institution i1=new Institution("technodeed", new Date(),"NC");
        i1.setAddress("Syntatech");
        i1.setOwnerName("Mounika");
        i1.setCode(789);
        System.out.println(i.getAddress());
        System.out.println(i1.getAddress() +"---"+i1.getOwnerName()+"---"+i1.getCode());
        Employee e = new Employee("Mouni","technodeed");
        System.out.println(e.getAddress());
        Employee e1= new Employee("mouni","techno");
        e1.noOfCourses =10;



    }
}