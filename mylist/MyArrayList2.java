package mylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        // al.add("Odisha"); // ❌ Not allowed (Integer list)
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        al.add(80);
        al.add(90);
        al.add(100);

        System.out.println(al);
        System.out.println();

        System.out.println("Looping using foreach loop");
        for (Integer a : al) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Using Iterator");

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Using ListIterator");

        ListIterator<Integer> ltr = al.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }
        System.out.println();
        System.out.println("using list iterator in reverse order");
        while (ltr.hasPrevious()) {
        	System.out.println(ltr.previous());
        }
        
    }
}
