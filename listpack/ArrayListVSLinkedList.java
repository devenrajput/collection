package collection.listpack;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
    static long startTime, endTime;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        ArrayListVSLinkedList.addOprationArrayList(arrayList);
        ArrayListVSLinkedList.addOprationLinkedList(linkedList);
        ArrayListVSLinkedList.getOprationArrayList(arrayList);
        ArrayListVSLinkedList.getOprationLinkedList(linkedList);
        ArrayListVSLinkedList.removeOprationArrayList(arrayList);
        ArrayListVSLinkedList.removeOprationLinkedList(linkedList);

    }

    static void addOprationArrayList(ArrayList<Integer> arrayList) {

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList add Time: " + (endTime - startTime));
    }

    static void addOprationLinkedList(LinkedList<Integer> linkedList) {

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add Time: " + (endTime - startTime));
    }

    static void getOprationArrayList(ArrayList<Integer> arrayList) {

        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList get Time: " + (endTime - startTime));
    }

    static void getOprationLinkedList(LinkedList<Integer> linkedList) {

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get Time: " + (endTime - startTime));
    }

    static void removeOprationArrayList(ArrayList<Integer> arrayList) {

        startTime = System.nanoTime();
        for (int i = 999999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList remove Time: " + (endTime - startTime));
    }

    static void removeOprationLinkedList(LinkedList<Integer> linkedList) {

        startTime = System.nanoTime();
        for (int i = 999999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList remove Time: " + (endTime - startTime));
    }
}