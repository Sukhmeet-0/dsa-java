// import java.util.Arrays;

public class RotatingMatrixBy90 {
    static int [][]a={{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(Arrays.deepToString(a));
        // rotateMatrix(a);
        
        
        //        OR    
        
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[0].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

        for(int i=0;i<a.length;i++){

        int li=0;
        int ri=a[i].length-1;

        while(li<ri){
            int temp=a[i][li];
            a[i][li]=a[i][ri];
            a[i][ri]=temp;
            li++;
            ri--;
        }

        }
        display();
        
    }
    static void display(){
        System.out.println();
        System.out.println("After rotating...");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    // static boolean rotateMatrix(int[][] m){
    //     if(m.length==0||m.length!=m[0].length)return false;
    //     int n=m.length;
    //     for(int layer=0;layer< n/2;layer++){
    //         int first=layer;
    //         int last=n-1-layer;
    //         for(int i=first;i<last;i++){
    //             int offset=i-first;
    //             int top=m[first][i];
    //             m[first][i]=m[last-offset][first];
    //             m[last-offset][first]=m[last][last-offset];
    //             m[last][last-offset]=m[i][last];
    //             m[i][last]=top;
                    
    //         }

    //     }
    //     System.out.println(Arrays.deepToString(m));
    //     return true;
    // }
}
