package collection.listpack;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
// import java.util.ArrayList;
// import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
    //     Vector vector = new Vector();
    //     System.out.println(vector.capacity());
    //     vector.add(11);
    //     vector.add(12);
    //     vector.add(13);
    //     vector.add(14);
    //     vector.add(15);
    //     vector.add(16);
    //     vector.add(17);
    //     vector.add(18);
    //     vector.add(19);
    //     vector.add(20);
    //     vector.add(21);
    //     System.out.println(vector.capacity());
    //     System.out.println(vector.isEmpty());
    //     System.out.println(vector.size());

    //     Vector vector1 = new Vector(3);
    //     System.out.println(vector1.capacity());
    //     System.out.println(vector1.isEmpty());
    //     System.out.println(vector1.size());
    //     vector1.add(18);
    //     vector1.add(19);
    //     vector1.add(20);
    //     vector1.add(21);
    //     System.out.println(vector1.capacity());
    //     System.out.println(vector1.isEmpty());
    //     System.out.println(vector1.size());

    //     ArrayList arrayList = new ArrayList();
    //     arrayList.add(22);

    //     Vector vector2 = new Vector(arrayList);
    //     vector2.add(25);

    //     System.out.println(vector2);

    //     Vector vector3 = new Vector(3,1);
    //     vector3.add(18);
    //     vector3.add(19);
    //     vector3.add(20);
    //     vector3.add(21);
    //     System.out.println(vector3.capacity());
    //     System.out.println(vector3.size());

    //     System.out.println("Enumeration.......");

    //    Enumeration enumeration = vector.elements();

    //     while (enumeration.hasMoreElements()) {
    //        System.out.print(enumeration.nextElement()+" ");
    //     }

        try{

        InputStream inputStream = new FileInputStream("C:\\Users\\Shiley\\Desktop\\dev.txt");
        InputStream inputStream2 =  new FileInputStream("C:\\Users\\Shiley\\Desktop\\dev1.txt");


        Vector<InputStream> streams = new Vector<>();
        streams.add(inputStream);
        streams.add(inputStream2);

        Enumeration<InputStream> enumeration =streams.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);

        int data = sequenceInputStream.read();

        while (data != -1) {

            char c = (char)data;

            System.out.print(c);
            data = sequenceInputStream.read();
        }
        sequenceInputStream.close();
        }catch(Exception exception){

        }


    }
}
