public class FizzBuzz{

public static void main(String[] args) {
        for (int i=1; i<=100; i++){
        int n = (i/3);
        int m = (i/5);
            if (i == n && i == m){
                System.out.print("FizzBuzz");
            }else{
                if (i==n){
                    System.out.print("Fizz");
                }else{
                    if(i==m){
                        System.out.print("Buzz");
                    }else{
                       System.out.println(i);
                }
            }
        }
    }
}
}
