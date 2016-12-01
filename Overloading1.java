public class Overloading1
{
    // Overloaded methods
    public void fun(Integer i)
    {
        System.out.println("fun(Integer ) ");
    }
    public void fun(String name)
    {
        System.out.println("fun(String ) ");
    }
 
    // Driver code 
    public static void main(String [] args)
    {
        Overloading1 mv = new Overloading1();
 
        // This line causes error
        mv.fun(null);
    }
}

//
//Output
//-----------
//22: error: reference to fun is ambiguous
//        mv.fun(null);
//          ^
//  both method fun(Integer) in Test and method fun(String) in Test match
//1 error
//The reason why we get compile time error in the above scenario is, here the method arguments Integer and 
//String both are not primitive data types in Java. 
//That means they accept null values. 
//When we pass a null value to the method1 the compiler gets confused which method it has to select, as both are accepting the null.
//
