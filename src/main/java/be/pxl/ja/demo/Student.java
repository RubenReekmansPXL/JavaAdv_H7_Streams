package be.pxl.ja.demo;

public class Student {
    private String name;
    private int graduationYear;
    private int score;

    public Student(String name, int graduationYear, int score) {
        this.name = name;
        this.graduationYear = graduationYear;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", graduationYear=" + graduationYear +
                ", score=" + score +
                '}';
    }
}
