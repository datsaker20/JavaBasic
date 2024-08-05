package Hello;

import java.util.Arrays;

public class HelloWorld {
	public boolean isReverse(String s) {
	String reverse = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	reverse += s.charAt(i);
	}
	return reverse.equals(s);
	}

	public static void main(String[] args) {
		// An array storing different ages
		Object[] array = { 1, "Hek", 2, 3, 21.4f, "hello", 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23, 24, 25, 26, 27, 28, 29, 30 };
				System.out.println(Arrays.toString(array));

	}

}
