// Java program to demonstrate
// listIterator() method
// for String value
package collection_framework.arrayList_methods.listIterator_method;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example1 {
    public static void main(String[] args) throws Exception {
        try {

            // Creating object of ArrayList<Integer>
            ArrayList<String> arrlist = new ArrayList<String>();

            // adding element to arrlist
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");

            // print arrlist
            System.out.println("ArrayList: "
                    + arrlist);

            // Creating object of ListIterator<String>
            // using listIterator() method
            ListIterator<String> iterator = arrlist.listIterator();

            // Printing the iterated value
            System.out.println("\nUsing ListIterator:\n");
            while (iterator.hasNext()) {
                System.out.println("Value is : "
                        + iterator.next());
            }
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
