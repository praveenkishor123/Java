// Java code explaining the Math Class methods
// ulp(), log1p()
// log1p() : java.math.log1p() method returns the natural log of (passed argument + 1)
// ulp() : java.math.ulp() method returns Unit of least precision(ulp), i.e., the least
// distance between two floating point numbers. Here, it is the least distance between the argument
// and next larger value.
import java.lang.*;
public class MathClassMethods2
{
    public static void main(String args[])
    {
        // Use of ulp() method
        double x = 34.652, y = -23.34789;
        double u = Math.ulp(x);
        System.out.println("ulp of 34.652    : " + u);
 
        u = Math.ulp(y);
        System.out.println("ulp of -23.34789 : " + u);
        System.out.println("");
 
        // Use of log() method
        double l = 99;
        double l1 = Math.log1p(l);
        System.out.println("Log of (1 + 99)  : " + l1);
 
        l1 = Math.log(100);
        System.out.println("Log of 100       : " + l1);
    }
}


//
//Output:
//==========================================
//ulp of 34.652    : 7.105427357601002E-15
//ulp of -23.34789 : 3.552713678800501E-15
//
//Log of (1 + 99)  : 4.605170185988092
//Log of 100       : 4.605170185988092
//

