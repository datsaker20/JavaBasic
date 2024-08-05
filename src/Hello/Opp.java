package Hello;

public class Opp extends HelloWorld {
    
    public static void main(String[] args) {
        HelloWorld world = new HelloWorld();
        boolean isResult = world.isReverse("hello");
        System.out.println(isResult);

    }

}
