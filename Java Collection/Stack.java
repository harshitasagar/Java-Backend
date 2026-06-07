/*Stack

Stack class implements the LIFO (last-in-first-out) data structure. It supports core operations like push() and pop(), along with peek(), empty(), and search(). Stack is a subclass of Vector and inherits its properties.

Let's understand the stack with an example:*/

import java.util.*;
public class GFG {

    // Main Method
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
/*
Output
Geeks For Geeks Geeks 
Geeks For Geeks 
*/