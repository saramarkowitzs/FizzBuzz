public class FizzBuzz{
public static void main(String[] args) {
        for (int i=1; i<=100; i++){
        int f = i%3;
        int b = i%5;
            if ( f == 0 && b == 0){
                System.out.print("FizzBuzz");
            }else{
                if (f==0){
                    System.out.print("Fizz");
                }else{
                    if(b==0){
                        System.out.print("Buzz");
                    }else{
                       System.out.println(i);
                    }
                }
            }
        }
}
}
