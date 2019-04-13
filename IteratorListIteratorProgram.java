
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;

class IteratorListIteratorExample {

    public static void main(String[] args) {

        List listObject = new ArrayList();
        listObject.add("AAA");
        listObject.add("BBBB");

        ListIterator listIteratorObject = listObject.listIterator();
        System.out.println("ListIterator object output in forward direction:");
        System.out.println("");

        while (listIteratorObject.hasNext()) {
            System.out.println(listIteratorObject.next());
        }

        System.out.println("ListIterator object output in backward direction:");
        System.out.println("");

        while (listIteratorObject.hasPrevious()) {
            System.out.println(listIteratorObject.previous());
        }

        List iteratorListObject = new ArrayList();

        iteratorListObject.add("CCCCC");
        iteratorListObject.add("DDDDDDD");
        iteratorListObject.add("EEEEEEEEE");

        Iterator itr = iteratorListObject.iterator();
        System.out.println("Iterator object output in forward direction:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
