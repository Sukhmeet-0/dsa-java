import java.util.Arrays;
public class DeletingElementInArray {
    static int []a=null;
    public static void main(String[] args) {
        Insert(5);
        Ins(0, 1);
        Ins(1, 2);
        Ins(2, 13);
        Ins(2, 144);
        Ins(3, 18);
        Ins(4, 11);
        access();
        Traverse();
        finding(11);
        deleteValue(3);
        
    }
    static void Insert(int n){
        a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=0;
        }
        // System.out.println(Arrays.toString(a));
    }
    public static void Ins(int loc,int value){
        if(a[loc]==0){
            a[loc]=value;
            System.out.println("successfully inserted !!");
        }
        else{
            System.out.println("This cell is already occupied");
        }
        System.out.println(Arrays.toString(a));
    }
    static void access(){
        System.out.println(a[1]);
        System.out.println(a[4]);
        System.out.println(a[2]);// x out of bound(out of size of array)
    }
    static void Traverse(){
        for(int j=0;j<a.length;j++){//------------------->O(n)
            System.out.print(a[j]+",");//---------------->O(1)
        }
        System.out.println();
    }
    static void finding(int n){
        for(int i=0;i<a.length;i++){//------------------>O(n)
            if(n==a[i]){//------------------------->O(1)
                System.out.println("Found "+a[i]+ " at "+i);//---------------------->O(1)
                return;
            }
        }
        System.out.println("Element not found");//-------------------->O(1)
    }
    static void deleteValue(int index){
        a[index]=Integer.MIN_VALUE;//--------------->O(1)
        System.out.println("element deleted");//------------------->O(1)
        System.out.println(Arrays.toString(a));//--------------------->O(1)
    }
}


