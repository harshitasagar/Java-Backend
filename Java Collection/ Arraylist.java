/*ArrayList provides a dynamic array in Java that resizes automatically as elements are added or removed. Although slower than standard arrays, it is efficient for frequent modifications. It supports random access but cannot store primitive types directly—wrapper classes like Integer or Character are required

Let's understand the ArrayList with the following example:*/

import java.io.*;
import java.util.*;

class GFG {

    // Main Method
    public static void main(String[] args)
    {

        // Declaring the ArrayList with initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appending new elements at the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);

        // Printing elements
        System.out.println(al);

        // Remove element at index 3
        al.remove(3);

        // Displaying the ArrayList after deletion
        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}