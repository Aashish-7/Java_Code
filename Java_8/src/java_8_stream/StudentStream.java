package java_8_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Student1 {

  String name;
  int rollNo;
  int age;
  String address;

    public Student1(String name, int rollNo, int age, String address) {

        super();
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }


}

public class StudentStream {
    public static void main(String[] args) {

        List<Student1> student1List = new ArrayList<>();

        student1List.add(new Student1("Aashish", 1, 20, "mzn"));
        student1List.add(new Student1("Aashish", 5, 22, "dl"));
        student1List.add(new Student1("Ankur", 2, 21, "mrt"));
        student1List.add(new Student1("Aviral", 3, 22, "gzb"));
        student1List.add(new Student1("Shubham", 4, 23, "bdn"));
        student1List.add(new Student1("Shubham", 6, 34, "rj"));
        student1List.add(new Student1("Shubham", 7, 23, "chs"));

        List<String> studentName = student1List.stream().map(Student1::getName).collect(toList());
        studentName.forEach(System.out::println);


        System.out.println("____________________________________");
        long count = student1List.stream().filter(student1 -> student1.name.equalsIgnoreCase("Aashish")).count();
        System.out.println("Aashish is :"+count);

        long count1 = student1List.stream().filter(student1 -> student1.name.equalsIgnoreCase("Shubham")).count();
        System.out.println("Shubham is :"+count1);


        long count2 = student1List.stream().filter(student1 -> student1.name.equalsIgnoreCase("Aviral")).count();
        System.out.println("Aviral is :"+count2);

        long count3 = student1List.stream().filter(student1 -> student1.name.equalsIgnoreCase("Ankur")).count();
        System.out.println("Ankur is :"+count3);


        System.out.println("______________________");
        Map<String, Long> counting = student1List.stream().collect(
                Collectors.groupingBy(student1 -> student1.name, Collectors.counting()));
        System.out.println(counting);


        System.out.println("_______________-");
        List<String> nameList = student1List.stream().map(Student1::getName).collect(toList());
        Map<Integer, Long> nameList1 = student1List.stream().collect(
                Collectors.groupingBy(student1 -> student1.age, Collectors.counting()));
        System.out.println(nameList+" "+nameList1);

        System.out.println();
        System.out.println("+++++++++++++++++++");
        Map<String, Map<Integer, Long>> map = student1List.stream()
                        .collect(
                                Collectors.groupingBy(Student1::getName,
                                        Collectors.groupingBy(Student1::getAge, Collectors.counting())));
        System.out.println(map);


        System.out.println("______________________");
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(5,6,7,8,9));
        List<Integer> combinedList = Stream.of(firstList, secondList)
                .flatMap(integers -> integers.stream())
                .collect(Collectors.toList());
        System.out.println(combinedList);


        System.out.println("__________________");
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
        List<List<Integer>> list = new ArrayList<>(lists);
        System.out.println(list);
        System.out.println("_______________");
        for (List<Integer> lists1 : lists) {
            System.out.println(lists1);
        }


        System.out.println("______________");
        Map<Integer, String> groupByRollNo = student1List.stream()
              .collect(Collectors.toMap(student1 -> student1.rollNo, student1 ->student1.name));
        System.out.println(groupByRollNo);


        System.out.println("______________");
        Map<Integer, List<Student1>> multimap = student1List.stream().collect(
                Collectors.groupingBy(
                        Student1::getRollNo));
        multimap.forEach((integer, student1s) -> student1s.forEach(student1 -> System.out.println(student1.rollNo+" "+ student1.address+" "+student1.age+" "+student1.name))
        );

        System.out.println("____________________");
        for(Student1 student1 : student1List) {
            System.out.println(student1.rollNo+" "+student1.name+" "+student1.address+" "+student1.age);
        }

    }


}
