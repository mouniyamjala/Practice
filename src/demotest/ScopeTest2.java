package demotest;
import Demo.*;
public class ScopeTest2 extends TestDemo{
    public static void main(String[] args)
    {
        /*
        TestDemo td1= new TestDemo();
        td1.d=90;

         */
        ScopeTest2 ST2=new ScopeTest2();
        ST2.d=90;
        //ST2.b=10;

    }

}
