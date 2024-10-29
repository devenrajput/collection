package collection.listpack;

import java.util.ArrayList;

public class UserDefineClass {
      public static void main(String[] args) {
        ArrayList<Emp> arrayList = new ArrayList<Emp>();
        Emp emp = new Emp("Devendra Kumar", "Google", 20);
        Emp emp1 = new Emp("Amit Kumar", "Google", 19);
        Emp emp2 = new Emp("Diwakar Kumar", "Google", 24);
        arrayList.add(emp);
        arrayList.add(emp1);
        arrayList.add(emp2);
        System.out.println(arrayList);
        for (Emp empTest : arrayList) {
            System.out.println(empTest);
        }
    }
    
}
class Emp{
    String name,cmpName;
    int age;
    Emp(String name,String cmpName,int age){
        this.name=name;
        this.cmpName=cmpName;
        this.age=age;
    }
    public String toString(){
        return name+" "+cmpName+" "+age;
    }
}