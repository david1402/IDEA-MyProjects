// A simple Java program to demonstrate the use of reflection
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

// class whose object is to be created
public  class Test implements Serializable, Cloneable
{
    // creating a private field
    private String s = "piton";
    public  int guru99IntVar1=1111;
    private int guru99IntVar2=2222;
    static String guru99StringVar1="guru99.com";
    static String guru99StringVar2="Learning Reflection API";

    // creating a public constructor

    public Test() {  }

    public Test(String s) {
        this.s = s;
    }

    public Test(String s, int guru99IntVar1, int guru99IntVar2) {
        this.s = s;
        this.guru99IntVar1 = guru99IntVar1;
        this.guru99IntVar2 = guru99IntVar2;
    }

    // Creating a public method with no arguments
    public void method1() {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    private void method2(int n) {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private int method3(boolean r,int f) {
        System.out.println("Private method invoked");
        return 1;
    }

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                '}';
    }
}
