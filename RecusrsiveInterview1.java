//sum of digits of positive integers
public class RecusrsiveInterview1 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(544));
    }
    public static int sumOfDigits(int n){
        if(n==0||n<0){
            return 0;
        }
        
        return n%10 + sumOfDigits(n/10);
    }
}
