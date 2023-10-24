public class FizzBuzz{

public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            String output = FizzBuzz(i);
            System.out.println(output);
        }
}
 public static String FizzBuzz(int n) {
        int d3 = ( n - 1) / 3;
        int d5 = ( n - 1) / 5;
        int r3 = n - (d3*3);
        int r5 = n - (d3*5);
        
        if (r3 == 0 && r5 ==0){
            return "FizzBuzz";
        }else{
            if(r3==0){
                return "Fizz";
            }else{
                if (r5 == 0){
                    return"buzz";
                }
            }
        }
        return Integer.toString(n);
}
}