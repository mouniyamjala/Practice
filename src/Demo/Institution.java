package Demo;
import java.util.*;

public class Institution{
    protected String name;
    private String address;
    private Date establishDate;
    private int code;
    private String ownername;
    int noOfCourses;

    public Institution(String name, Date date, String address)
    {
        this.name=name;
        this.establishDate=date;
        this.address=address;
    }

    public Institution() {

    }

    public void setAddress(String add)
    {
        this.address=add;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setOwnerName(String ownername)
    {
        this.ownername=ownername;
    }
    public void setCode(int code)
    {
        this.code=code;
    }
    public String getOwnerName()
    {
        return this.ownername;
    }
    public int getCode()
    {
        return this.code;
    }
}
