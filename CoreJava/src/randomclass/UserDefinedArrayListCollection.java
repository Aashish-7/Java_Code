package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class UserDefinedArrayListCollection     {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aashish", 21);
        Student s2 = new Student(102, "Aashu", 22);
        Student s3 = new Student(102, "Aashishsh", 23);

        ArrayList al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
        Student student  = (Student) itr.next();
            System.out.println(student.rollNo+" "+ student.name + " "+ student.age);
        }
    }
}
