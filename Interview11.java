// fibonacci and its complexity
public class Interview11 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n){
        if(n<0||n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);//   branches(function call) =2 and depth(iteration or variabel) =n
        }
    }
}
//  TIME COMPLEXITY
// O(2^n)
