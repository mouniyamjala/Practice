package Demo;

public class ScopeTest extends TestDemo {

    public static void main(String args[])
    {
        ScopeTest t = new ScopeTest();
        t.a=10; //public variable from TestDemo
        // t.b=20; private
        t.d=30; //protected can be accessed within the same package
        t.c="hello"; //default can be accessed in same package
        add();
    }
}
