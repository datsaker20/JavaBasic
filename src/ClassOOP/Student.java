package ClassOOP;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {

	// class attributes
	private String fullName;
	private int age;

	// class method
	public void study(int year) {
		age = year;
		System.out.println("Student is "+ age );
	}

}
