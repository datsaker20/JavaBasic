package Hello;

public class HelloWorld {
	public boolean isReverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse.equals(s);
	}

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		String name = "haha";
		String funcReverse = obj.isReverse(name) ? name + " Là kí tự đả ngược" : name + " Không là kí tự đảo ngược";
		System.out.println(funcReverse);

	}

}
