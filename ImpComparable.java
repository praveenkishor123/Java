import java.util.TreeSet;

class Dog implements Comparable<Dog> {
	
	int size;
	
	Dog(int s) {
		size = s;
	}
	
	public int compareTo(Dog o) {
		return size - o.size;
		
	}
}

public class ImpComparable {
	
	public static void main(String[] args) {
		
		TreeSet<Dog> d = new TreeSet<Dog>();
		
		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		
		TreeSet<Integer> i = new TreeSet<Integer>();
		
		i.add(1);
        i.add(2);
        i.add(3);
 
        System.out.println(d.size() + " " + i.size());
		
		
		
	}
}
