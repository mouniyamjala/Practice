package Demo;
import java.util.*;
public class Employee extends Institution{
    private String ename;
    Employee(String ename,String instname)
    {
        //points to parent class, super is used in the first  line in the child class constructor
        super(instname,new Date(),"add");
        this.name=instname;
        this.ename=ename;
    }
    public String getEname()
    {
        return this.ename;
    }
    public void setEname(String name)
    {
        this.ename=name;
    }
}
