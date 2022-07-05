import java.util.Arrays;

public class InsertionInArray{
    static int []a=null;   
    public static void main(String[] args) {
        Insert(5);
        Ins(0, 1);
        Ins(1, 1);
        Ins(2, 1);
        Ins(2, 1);
        Ins(3, 1);
        Ins(4, 1);
        
    }
    static void Insert(int n){
        a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.MIN_VALUE;
        }
        // System.out.println(Arrays.toString(a));
    }
    public static void Ins(int loc,int value){
        if(a[loc]==Integer.MIN_VALUE){
            a[loc]=value;
            System.out.println("successfully inserted !!");
        }
        else{
            System.out.println("This cell is already occupied");
        }
        System.out.println(Arrays.toString(a));
    }
}