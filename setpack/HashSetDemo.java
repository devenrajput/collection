package collection.setpack;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        int i =1;
        while (i<=10) {
            set.add(i);
            i++;
        }
        for(int j=5;j<=15;j++){
            set.add(j);
        }
        System.out.println(set);
        for (Integer integer : set) {
            System.out.print(integer+" ");
        }
        
    }
}
