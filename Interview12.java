// powers of 2 and its complexity
public class Interview12 {
    public static void main(String[] args) {
        System.out.println(powerOf2(50 ));
    }
    static int powerOf2(int n){
        if(n<1){
            return 0;
        }
        else if(n==1){
            // System.out.println(1);
            return 1;
        }
        else{
            int prev=powerOf2(n/2);
            int curr=prev*2;
            return curr;
        }
    }
}
// TIME COMPLEXITY

// O(logN)
