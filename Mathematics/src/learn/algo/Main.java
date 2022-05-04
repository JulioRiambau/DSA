package learn.algo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Mathematics");
        //Quiz.moduloPower2(7,256, 13);
        var powers = Quiz.NumberToPowers2(100);
        int result = 1;
        for (int power : powers) {
           result = result * Quiz.moduloPower2(7,power, 5);
        }

        System.out.println(result%5);
    }
}
