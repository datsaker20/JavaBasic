package ClassOOP;

import java.util.Scanner;

public class Vid26 {
	public static void main(String[] args) {
		System.out.println("Run vid 26 \n");
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		student.study(count);
	}
}
