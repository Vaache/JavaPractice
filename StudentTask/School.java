package StudentTask;

import java.util.Arrays;

public class School {
	private Student[] students;
	private int studentCount;

	public School() {
		this.students = new Student[10];
		this.studentCount = 0;
	}

	public School(Student[] students, int studentCount) {
		this.students = students;
		this.studentCount = studentCount;
	}

	void addStudent(Student student) {
		if (this.studentCount == this.students.length) {
			this.reallocStudents();
		}
		this.students[studentCount] = student;
		++this.studentCount;
	}

	public Student[] getStudents() {
		return students;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	private void reallocStudents() {
		Student[] tmp = new Student[this.students.length * 2];
		System.arraycopy(this.students, 0, tmp, 0, this.students.length);
		this.students = tmp;
	}

}
