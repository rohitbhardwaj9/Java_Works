// Java Program Demonstrate forEach()
// method of ArrayList
package collection_framework.arrayList_methods.forEach_method;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        // create an ArrayList which going to
        // contains a list of Numbers
        ArrayList<Integer> Numbers = new ArrayList<Integer>();

        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        // forEach method of ArrayList and
        // print numbers
        Numbers.forEach((n) -> System.out.println(n));
    }
}
