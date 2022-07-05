import java.util.Arrays;
public class Searching2DArray {
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


        
        insert();
        System.out.println(a.length);
        ins(5, 1, 1);
        ins(6, 1, 0);
        ins(3, 0, 0);
        ins(2, 0, 1);
        ins(5, 0, 1);
        acess(1, 0);
        acess(1, 2);

        traverse();

        search(5);
        search(55);
        
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
    static void acess(int r,int c){
        // System.out.println(a[r][c]);//--------------------->O(1)
        System.out.println("Accessing row: "+r+" column: "+c);
        try {
            System.out.println("value : "+a[r][c]);;//--------------------->O(1)
        } catch (Exception e) {
            System.out.println("Index out of Bound!!");;//--------------------->O(1)
        }
    }
    static void traverse(){
        for(int i=0;i<a.length;i++){//-------------------->O(m)---------]
            //                        ----------------------------------]------>O(mn)
            for(int j=0;j<a.length;j++){//----------------->O(n)--------]
                System.out.print(a[i][j]+" ");//------------------>O(1)
            }
            System.out.println();//------------>O(1)
        }
    }
    static void search(int n){
        for(int r=0;r<a.length;r++){//-------------------->O(m)----------]
            //                                                 ----------]------------>O(mn)
            for(int c=0;c<a.length;c++){//----------------->O(n)---------]
                if(a[r][c]==n){//---------------->O(1)
                    System.out.println("Found element at row: "+r+" column: "+c);//----------------->O(1)
                    System.out.println(a[r][c]);//---------------->O(1)
                    return;//------------>O(1)
                    // continue;//------------->O(1)
                    // return;
                }
                // System.out.println("Element not found");
            }
        }
        System.out.println("Element not found");
    }
}






