//power of number using recursion
public class Interview2 {
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
    public static int power(int base,int exp)
    {
        if(exp==0||exp==1){
            return base;
        }
        if(exp<0){
            return -1;
        }
        return base * power(base, exp-1);
    }
}
