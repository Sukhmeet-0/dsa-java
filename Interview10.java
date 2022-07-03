// factorial and its complexity
public class Interview10 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){// ---------------->M(n)
        if(n<0){ // ---------------------->O(1)
            return -1;
        }
        else if(n==0){// ---------------------->O(1)
            return 1;
        }
        else{
            return n*factorial(n-1);// ---------------------->M(n-1)
        }
    }
}

//  TIME COMPLEXITY
// M(n)=O(1)+M(n-1) after getting value of M(n-1)
// we get 3+M(n-3)
// a+M(n-a) putting n in place of a
// n+M(n-n)
//n+1
//n

//    O(n)