package demotest;
import Demo.*;


public class ScopeTest1 {
    public static void main(String args[])
    {
        TestDemo td=new TestDemo();
        td.a=15;
        // tb.d=9; variable d can not be accessed as there is no relation b/w classes
        //td.c="hi"; variable 'c' can not be accessed at as it in other package
    }
}
