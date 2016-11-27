package coreJava;

// 'this' is a reference variable that refers to the current object.
class Test
{
    // Instance variable or member variable
    private int value = 10; 
 
    void method()
    {
        // This local variable hides instance variable
        int value = 40;
 
        System.out.println("Value of Instance variable :" + this.value);
        System.out.println("Value of Local variable :" + value);
    }
}
 
public class InstanceVariableHiding
{
    public static void main(String args[])
    {
        Test obj1 = new Test();
        obj1.method();
    }
}
//
//Output
//-------
//Value of Instance variable :10
//Value of Local variable :40
