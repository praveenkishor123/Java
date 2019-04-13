## Difference between Iterator and ListIterator in Java

1. Traversal Direction  :  
ListIterator allows to iterate the list objects in both directions i.e forward as well as backward direction using previous() and next() 
method.

2.  Set and Map implemented Objects Traversal : 
ListIterator can be used to traverse List object only . But Iterator can be used to traverse Map, List and Set implemented objects.

3. Add or Set operation at any index :
ListIterator can modify the list  during iteration using add(E e) , remove() or set(E e).
Iterator can not add the element during traversal but they can remove the element from the underlying collection during the iteration 
as they only consist of remove() method. There is no add(E e) and set(E e) method in Iterator. 

4. Determine Iterator's current position :  
ListIterator can obtain the iterator's current position in the list. Iterator's current position during traversal can not 
be determined using Iterator. 

5. Retrieve Index of the element : 
ListIterator can obtain the index of the elements using previousIndex(E e) or nextIndex(E e) methods. 
We can not obtain the index using Iterator as there is no such methods present. 

