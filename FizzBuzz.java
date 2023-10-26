public class FizzBuzz {
    public static void main(String[] args) {
        int f = 3; 
        int b = 5;
        for (int i = 1; i <= 100; i++) {
            f--; //increments down to 0
            b--;
            if (f == 0 && b == 0) {
                System.out.println("FizzBuzz");
                f = 3; //reset counter to 3
                b = 5; //reset counter to 5
            } else if (f == 0) {
                System.out.println("Fizz");
                f = 3;
            } else if (b == 0) {
                System.out.println("Buzz");
                b = 5;
            } else {
                System.out.println(i);
            }
        }
    }
}