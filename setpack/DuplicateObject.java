package collection.setpack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateObject {

    public static void main(String[] args) {
        Student student1 = new Student("Devendra Kumar", 101, "HIMT");
        Student student2 = new Student("Diwakar Kumar", 102, "HIMT");
        Student student3 = new Student("Divya Kumar", 103, "HIMT");
        Student student4 = new Student("Devendra Kumar", 101, "HIMT");

        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        student4.setName("Amit Kumar Yadav");

        for (Student student : arrayList) {
            System.out.println(student);
        }

        Set<Student> set = new HashSet<Student>();

        set.add(student1);
        set.add(student1);
        set.add(student4);

        student4.setName("Aman Kumar");

        Iterator<Student> iterator = set.iterator();

        System.out.println();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }

    }

}

class Student {
    private String name;
    private int studentId;
    private String studentClgName;

    public Student() {
        super();
    }

    public Student(String name, int studentId, String studentClgName) {
        this.name = name;
        this.studentId = studentId;
        this.studentClgName = studentClgName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentClgName() {
        return studentClgName;
    }

    public void setStudentClgName(String studentClgName) {
        this.studentClgName = studentClgName;
    }

    @Override
    public String toString() {
        return "name=" + name + ", studentId=" + studentId + ", studentClgName=" + studentClgName;
    }

}