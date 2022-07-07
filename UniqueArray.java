// to check if array is unique
public class UniqueArray {
    public static void main(String[] args) {
        int[]b={3,5,6,4};
        System.out.println(unique(b));
    }
    static boolean unique(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("This array is not unique!!");
                    return false;
                }
            }
        }
        System.out.println("This array is Unique");
        return true;
    }
}
