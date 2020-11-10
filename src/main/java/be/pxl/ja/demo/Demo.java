package be.pxl.ja.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2018, 82));
        students.add(new Student("Bob", 2017, 90));
        students.add(new Student("Carol", 2018, 67));
        students.add(new Student("David", 2018, 80));
        students.add(new Student("Eric", 2017, 55));
        students.add(new Student("Frank", 2018, 49));
        students.add(new Student("Gary", 2017, 88));
        students.add(new Student("Henry", 2017, 98));
        students.add(new Student("Ivan", 2018, 66));
        students.add(new Student("John", 2017, 52));

        List<Student> newList = new ArrayList<>();
        for(Student student: students){
            if(student.getGraduationYear()==2017 && student.getScore()>=70){
                newList.add(student);
            }
        }
        System.out.println(newList);

        List<Student> newStudentList = students.stream()
                .filter(s -> s.getGraduationYear() == 2017)
                .filter(s -> s.getScore() >= 70)
                .collect(Collectors.toList());

        newStudentList.forEach(System.out::println);
//        System.out.println(newStudentList);

    }
}
