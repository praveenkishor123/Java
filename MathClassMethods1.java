// Java code explaining the Math Class methods
// signum(), round(), max()
import java.lang.*;
public class MathClassMethods1
{
    public static void main(String args[])
    {
        // Use of signum() method
        double x = 10.4556, y = -23.34789;
        double signm = Math.signum(x);
        System.out.println("Signum of 10.45  = " + signm);
 
        signm = Math.signum(y);
        System.out.println("Signum of -23.34 = " + signm);
        System.out.println("");
 
        // Use of round() method
        double r1 = Math.round(x);
        System.out.println("Round off 10.4556  = " + r1);
 
        double r2 = Math.round(y);
        System.out.println("Round off 23.34789 = " + r2);
        System.out.println("");
 
        // Use of max() method on r1 and r2
        double m = Math.max(r1, r2);
        System.out.println("Max b/w r1 and r2 = " + r2);
    }
}


//Output:
//=====================================
//Signum of 10.45  = 1.0
//Signum of -23.34 = -1.0
//
//Round off 10.4556  = 10.0
//Round off 23.34789 = -23.0
//
//Max b/w r1 and r2 = -23.0
//
