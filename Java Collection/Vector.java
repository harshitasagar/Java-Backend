/*
Vector:

Vector provides a dynamic array in Java, similar to ArrayList, but with synchronized methods for thread safety. While slower due to synchronization overhead, it is useful in multi-threaded environments. Like ArrayList, it resizes automatically during element manipulation.
Let's understand the Vector with an example:
*/

import java.io.*;
import java.util.*;

class GFG {

    // Main Method
    public static void main(String[] args)
    {

        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements at the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the Vector after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}

/*
Output
[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5 
*/