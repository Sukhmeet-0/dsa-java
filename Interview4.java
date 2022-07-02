public class Interview4 {
    public static void main(String[] args) {
        System.out.println(DecToBin(10));
    }
    public static int DecToBin(int n){
        if(n==0){
            return 0;
        }
        return n%2 + 10*DecToBin(n/2);
    }
}
