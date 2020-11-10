package be.pxl.ja.exercise1;

import be.pxl.ja.exercise1.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = StudentDao.createStudents();

        // 1
        List<Student> studentList1 = students.stream()
                .filter(s -> s.getDateOfBirth().getMonth().equals(LocalDate.now().getMonth()))
                .filter(s -> s.getDateOfBirth().getDayOfMonth() == LocalDate.now().getDayOfMonth())
                .collect(Collectors.toList());

        System.out.println("1)");
        studentList1.forEach(s -> System.out.println(s.getName()));
        System.out.println();

        // 2
        List<Student> studentList2 = students.stream()
                .filter(s -> s.getName().equals("Carol"))
                .collect(Collectors.toList());

        System.out.println("2)");
        studentList2.forEach(System.out::println);
        System.out.println();

        // 3
        long count = students.stream()
                .filter(s -> s.getGraduationYear() == 2017)
                .count();

        System.out.println("3)");
        System.out.println(count + " students");;
        System.out.println();

        //4
        List<Student> studentList3 = students.stream()
                .sorted((x, y) -> y.getScore() - x.getScore())
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("4)");
        studentList3.forEach(System.out::println);
        System.out.println();

        /*//5
        List<Student> studentList4 = students.stream()
                //todo sorteren van oud naar jong
                .sorted()
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("5)");
        studentList4.forEach(System.out::println);
        System.out.println();*/

        //6
        List<Student> studentList5 = new ArrayList<>(students);

        System.out.println("6)");
        studentList5.forEach(s -> System.out.print(s.getName() + ", "));
        System.out.println();


        /*//7
        List<Student> studentList6 = students.stream()
                //todo sorteren van jong naar oud
                .filter(s -> s.getGraduationYear() == 2018)
                .sorted()
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("8)");
        studentList6.forEach(System.out::println);
        System.out.println();*/

        /*//8
        List<Student> studentList7 = students.stream()
                //todo snap de opgave niet
                .map()
                .collect(Collectors.toList());

        System.out.println("8)");
        studentList7.forEach(System.out::println);
        System.out.println();
        */

        /*//9
        List<Student> studentList8 = students.stream()
                //todo sorteren op afstudeerjaar
                .filter(s -> s.getGraduationYear() == 2018)
                .sorted()
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("9)");
        studentList8.forEach(System.out::println);
        System.out.println();*/
    }
}
