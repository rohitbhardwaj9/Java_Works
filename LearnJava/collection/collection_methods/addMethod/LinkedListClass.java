//java code to illustrate boolean add() method

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        //creating an empty LinkedList
        Collection<String> linkedlist = new LinkedList<String>();

        //use add() method to add elements in the list
        linkedlist.add("Geeks");
        linkedlist.add("for");
        linkedlist.add("Geeks");

        //output the present list
        System.out.println("The list is: "+ linkedlist);
    }
}
