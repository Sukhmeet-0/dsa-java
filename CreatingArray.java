import java.lang.reflect.Array;
import java.util.Arrays;// to display array
public class CreatingArray {
    public static void main(String[] args) {
        int []Array;//declaration------------------>O(1)
        Array=new int[3];// instantition------------------>O(1)
        Array[0]=4;// declaration------------------>O(1)--------]
        Array[1]=9;//------------------>O(1)--------------------]----------->O(n)
        Array[2]=3;//------------------>O(1)--------------------]
        System.out.println(Array);
        System.out.println(Arrays.toString(Array));// displaying array


        // creating array in one line

        String[] sArray={"a","b","c"};//------------------>O(1)
        System.out.println(Arrays.toString(sArray));
    }
}
