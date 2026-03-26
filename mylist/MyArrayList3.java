package mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList3 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("I");
        al.add("am");
        al.add("Bishnu");
        al.add("Charan");
        al.add("Nayak");

        // Print full list
        System.out.println("ArrayList: " + al);
        System.out.println();

        // 1. For-each loop
        System.out.println("Using For-Each Loop:");
        for (String s : al) {
            System.out.print(s + " ");
        }

        System.out.println("\n");

        // 2. Iterator
        System.out.println("Using Iterator:");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n");

        // 3. ListIterator (forward)
        System.out.println("Using ListIterator (Forward):");
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }

        System.out.println("\n");

        // 4. ListIterator (backward)
        System.out.println("Using ListIterator (Backward):");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
    }
}
