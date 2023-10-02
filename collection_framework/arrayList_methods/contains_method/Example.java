// Demonstrate the working of the method contains() in an integer.
package collection_framework.arrayList_methods.contains_method;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // use contains() to check if the element
        // 2 exits or not
        boolean ans = arr.contains(2);

        if (ans)
            System.out.println("The list contains 2");
        else
            System.out.println("The list does not contains 2");

        // use contains() to check if the element
        // 5 exits or not
        ans = arr.contains(5);

        if (ans)
            System.out.println("The list contains 5");
        else
            System.out.println("The list does not contains 5");
    }
}
