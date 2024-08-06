package ClassOOP;

public class Student {

	// class attributes
	private String fullName;
	private int age;

	public Student() {
	}

	public Student(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return this.fullName;
	}

	// class method
	public void study(int year) {
		age = year;
		System.out.println("Student is " + age);
	}

}
