package be.pxl.ja.oefening7_4;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private String name;
	private int graduationYear;
	private int score;
	private LocalDate dateOfBirth;

	public Student(String name, int graduationYear, int score, LocalDate dateOfBirth) {
		this.name = name;
		this.graduationYear = graduationYear;
		this.score = score;
		this.dateOfBirth = dateOfBirth;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public boolean isBirthday(){
		LocalDate now = LocalDate.now();
		return dateOfBirth.getMonthValue() == now.getMonthValue() && dateOfBirth.getDayOfMonth() == now.getDayOfMonth();
	}
	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", graduationYear=" + graduationYear +
				", score=" + score +
				", dateOfBirth=" + dateOfBirth +
				'}';
	}


	@Override
	public int compareTo(Student other) {
		return other.getScore() - this.getScore();
	}
}
