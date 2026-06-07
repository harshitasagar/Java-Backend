/*
LinkedList is a linear data structure where elements (nodes) are stored non-contiguously. Each node contains data and a reference to the next (and optionally previous) node, forming a chain of elements linked by pointers. 

Let's understand the LinkedList with the following example:
*/

import java.io.*;
import java.util.*;

class GFG {

    // Main Method
    public static void main(String[] args)
    {

        // Declaring the LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);

        // Printing elements
        System.out.println(ll);

        // Remove element at index 3
        ll.remove(3);

        // Displaying the List
        // after deletion
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}

/*
Output
[1, 2, 3, 4, 5]
[1, 2, 3, 5]
*/
1 2 3 5 