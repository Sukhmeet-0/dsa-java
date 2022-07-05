import java.util.Arrays;

public class Creating2DArray {
    public static void main(String[] args) {
        int [][]a;//--------------------------->O(1)
        a=new int[2][2];//--------------------------->O(1)
        a[0][0]=1;//--------------------------->O(1)---------------]
        a[0][1]=2;//--------------------------->O(1)---------------]------------->O(mn) where m is rows and n is columns
        a[1][0]=3;//--------------------------->O(1)---------------]
        a[1][1]=4;//--------------------------->O(1)---------------]

        System.out.println(Arrays.deepToString(a));

        // all together

        String [][]s={{"A","b"},{"c","d"}};//--------------------------->O(1)
        System.out.println(Arrays.deepToString(s));//--------------------------->O(1)
    }
}
