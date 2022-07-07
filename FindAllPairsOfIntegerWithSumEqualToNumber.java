import java.util.Arrays;

// fing pairs of arrays element whose sum is equal to the given target number
public class FindAllPairsOfIntegerWithSumEqualToNumber {
    public static void main(String[] args) {
        int []a={8,12,7,5,15};
        int[]result=twoSum(a, 20);
        System.out.println(Arrays.toString(result));
    }
    public static int[]twoSum(int []nums,int target){
        int[]b=new int[nums.length*2];
        for(int a=0;a<b.length;a++){
            b[a]=Integer.MIN_VALUE;
        }
        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                b[i]=j;
                b[j]=i;
            }
           }
        }
        return b;
    }

}
