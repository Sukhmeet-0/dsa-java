import java.util.Arrays;

public class InsertionIn2DArray {
    static int [][]a=null;
    public static void main(String[] args) {
        // int [][]a=null;//--------------------------->O(1)
        // a=new int[2][2];//--------------------------->O(1)
        // a[0][0]=1;//--------------------------->O(1)---------------]
        // a[0][1]=2;//--------------------------->O(1)---------------]------------->O(mn) where m is rows and n is columns
        // a[1][0]=3;//--------------------------->O(1)---------------]
        // a[1][1]=4;//--------------------------->O(1)---------------]

        // System.out.println(Arrays.deepToString(a));

        // // all together

        // String [][]s={{"A","b"},{"c","d"}};//--------------------------->O(1)
        // System.out.println(Arrays.deepToString(s));//--------------------------->O(1)


        ins(5, 1, 1);
        ins(5, 1, 0);
        ins(3, 0, 0);
        ins(3, 0, 0);
    }
    static void insert(){
        a=new int[2][2];//--------------------------->O(1)
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    static void ins(int n,int r,int c){
        if(a[r][c]==Integer.MIN_VALUE){
            a[r][c]=n;//--------------------------->O(1)
            System.out.println("Inserted successfully!!");//--------------------------->O(1)
        }
        else{
            System.out.println("No space available");//--------------------------->O(1)
        }
        System.out.println(Arrays.deepToString(a));//--------------------------->O(1)
    }
}
