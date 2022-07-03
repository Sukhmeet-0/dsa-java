// taking array as input and reversing it..


import java.util.Arrays;

public class Interview9 {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        revarray(a);
    }
    static void revarray(int []a){
        for(int i=0;i<a.length/2;i++){// ------------------->O(n/2)---->O(n)
            int other =a.length-i-1;// ---------------------->O(1)
            int temp=a[i];// ---------------------->O(1)
            a[i]=a[other];// ---------------------->O(1)
            a[other]=temp;// ---------------------->O(1)
        }
        System.out.println(Arrays.toString(a));// ---------------------->O(1)
    }
}
//      TIME COMPLEXITY
// O(n)