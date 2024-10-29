package collection.listpack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayListDemo
 */
public class ArrayListDemo {

    @Override
    public String toString() {
        return "Hii";
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        System.out.println(arrayListDemo);
        arrayList.add(23);
        System.out.println(arrayList);
        arrayList.add(0, 32);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.isEmpty());
        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()) {
           Object object =(Object) iterator.next();
           System.out.print(object);
        }
    }
}