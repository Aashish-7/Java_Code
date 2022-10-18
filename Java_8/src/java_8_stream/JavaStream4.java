package java_8_stream;


import java.util.ArrayList;
import java.util.List;

class Student{
    int id;
    String name;
    int age ;

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class JavaStream4 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Vikas",26));
        studentList.add(new Student(102, "Shubham", 25));
        studentList.add(new Student(103, "Aviral", 24));
        studentList.add(new Student(104, "Vikas", 40));

        studentList.stream()
                .filter(student -> student.name.equals("Vikas"))
                .forEach(student -> System.out.println(student.name));

    }
}
