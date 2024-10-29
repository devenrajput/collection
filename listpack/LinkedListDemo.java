package collection.listpack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("one");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        System.out.println(linkedList);

        Iterator<String> itr = linkedList.iterator();
        System.out.println(itr);

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        ListIterator<String> listIterator = linkedList.listIterator();

        System.out.println();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        System.out.println();
        while (listIterator.hasPrevious()) {

            System.out.print(listIterator.previous() + " ");
        }

        System.out.println("\n" + linkedList.contains("one"));


        LinkedList<String> linkedList2 = new LinkedList<>(linkedList);
        linkedList2Operation(linkedList2);
    }

    static void linkedList2Operation(LinkedList<String> linkedList2){

        linkedList2.add("Five");
        System.out.println(linkedList2);
        linkedList2.addFirst("Zero");
        System.out.println(linkedList2);
        linkedList2.add(2, "Two");
        System.out.println(linkedList2);
        linkedList2.addLast("Six");
        System.out.println(linkedList2);
        System.out.println(linkedList2.getFirst());
        System.out.println(linkedList2.getLast());
        System.out.println(linkedList2.get(4));

        linkedList2.removeFirst();
        linkedList2.removeLast();
        linkedList2.remove(2);

        System.out.println(linkedList2);
        linkedList2.removeAll(linkedList2);
        System.out.println(linkedList2);
        System.out.println(linkedList2.isEmpty());


    }
}
