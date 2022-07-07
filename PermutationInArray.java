// check permutation in two arrays
public class PermutationInArray {
    public static void main(String[] args) {
        int[]a={1,2,2,4};
        int []b={4,2,2,1};
        System.out.println(permutation(a, b));
    }
    static boolean permutation(int[]a,int []b ){
        if(a.length!=b.length){
            System.out.println("Not in permutation !!");
            return false;
        }
        int sum1=0;
        int sum2=0;
        int mul1=1;
        int mul2=1;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
            sum2+=b[i];
            mul1*=a[i];
            mul2*=b[i];
        }
        if(sum1!=sum2||mul1!=mul2){
            System.out.println("Not in permutation !!");
            return false;
        }
        System.out.println("In permutation !!");
        return true;
    }
}
