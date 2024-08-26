package StudentTask;


public class Student {
	private String name;
	private int Id;
	private double[] grades;
	private int size;

	public Student() {
		this.name = null;
		this.Id = -1;
		grades = new double[10];
		this.size = 0;
	}

	public Student(String name, int id, double[] grades) {
		this.name = name;
		this.Id = id;
		this.grades = grades;
		this.size = grades.length;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getSize() {
		return size;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public void addGrade(double grade) {
		if (this.size == grades.length) {
			this.reallocGrades();
		}
		this.grades[size] = grade;
		++this.size;
	}

	public double calculateAverageGrade() {
		double res = 0.0;
		for (int i = 0; i < grades.length; ++ i) {
			res += grades[i];
		}
		return res;
	}

	String getStudentDetails() {
		StringBuilder res = new StringBuilder("Name: " + this.name + "\nId: " + this.Id + "\nAverage grade: ");

		for (int i = 0; i < grades.length; ++ i) {
			res.append(grades[i]);
			if (i + 1 < grades.length)
				res.append(", ");
		}
		return res.toString();
	}

	void reallocGrades() {
		double[] tmp = new double[this.size * 2];

		System.arraycopy(this.grades, 0, tmp, 0, this.grades.length);

		this.grades = tmp;
	}

}


/*
Requirements:
Define Classes:
Student Class:
Private Fields:
String name: Stores the student's name.
int studentId: Stores the student's ID.
double[] grades: An array to store the student's grades.
Public Methods:
Constructor: Initializes the student with their name, ID, and an array of grades.
void addGrade(double grade): Adds a new grade to the student's list of grades.
double calculateAverageGrade(): Calculates and returns the average of the student's grades.
String getStudentDetails(): Returns a string containing the student's details (name, ID, and average grade).
School Class:
Private Fields:
Student[] students: An array to store a collection of Student objects.
int studentCount: Tracks the current number of students in the school.
Public Methods:
void addStudent(Student student): Adds a new student to the school.
void listStudents(): Displays details of all students in the school.
Student findStudentById(int studentId): Searches for a student by their ID and returns the corresponding Student object (returns null if the student is not found).
Abstraction and Encapsulation:
Abstraction:
Define clear and simple public methods that allow users to interact with the Student and School classes without needing to understand their internal implementation.
Encapsulation:
Keep the student details (name, studentId, grades) and the collection of students (students) private to protect them from unauthorized access or modification.
Provide public methods to interact with these fields in a controlled manner.
Implementation Details:
Student Class:
Encapsulate the student’s name, ID, and grades as private fields.
Provide methods to add grades, calculate the average grade, and return student details as a string.
School Class:
Manage a collection of Student objects using an array.
Provide methods to add new students, list all students, and find a student by their ID.
*/