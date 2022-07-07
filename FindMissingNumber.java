// finding missing element in an array
import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        int sum1=((100)*(100+1))/2;
        int []counting=new int[100];
        for(int i=0;i<counting.length;i++){
            counting[i]=n;
            n++;
            if(n==63){
                continue;
            }
            sum+=counting[i];
        }
        System.out.println(Arrays.toString(counting));
        System.out.println("Sum of 100 numbers is "+sum1);
        System.out.println(sum);
        System.out.println("Missing Element is : "+(sum1-sum+1));
    }
}
