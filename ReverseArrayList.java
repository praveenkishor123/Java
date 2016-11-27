import java.util.ArrayList;
import java.util.Collections;
 
public class ReverseArrayList {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        
        Collections.reverse(list);
        
        System.out.println("Results after reverse operation:");
        
        for(String str: list){
            System.out.println(str);
        }
    }
}

// Output
// --------------
// Results after reverse operation: Glass Watch Play Cric Java
//
