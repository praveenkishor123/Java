// Default array values in Java
// -----------------------------------
// If we don't assign values to array elements, and try to access them, compiler does not produce error as in case of simple variables.
// Instead it assigns values which aren't garbage.


// Below are the default assigned values.
// ------------------------------------------
// boolean : false
// int : 0
// double : 0.0
// String : null
// User Defined Type : null


// Java program to demonstrate default values of array
// elements
class ArrayDemo
{
    public static void main(String[] args)
    {
        System.out.println("String array default values:");
        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");
 
        System.out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
             System.out.print(val + " ");
 
        System.out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");
 
        System.out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");
 
        System.out.println("\n\nReference Array default values:");
        ArrayDemo ademo[] = new ArrayDemo[5];
        for (ArrayDemo val : ademo)
            System.out.print(val + " ");
    }
}


//
// Output:
// --------------------------------------
// String array default values:
// null null null null null 
 
// Integer array default values:
// 0 0 0 0 0 

// Double array default values:
// 0.0 0.0 0.0 0.0 0.0 

// Boolean array default values:
// false false false false false 

// Reference Array default values:
// null null null null null 
//

