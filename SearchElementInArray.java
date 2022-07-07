// search element in array
public class SearchElementInArray{
    public static void main(String[] args) {
        int []b={1,4,5,7,4,10};
        find(b,10);
        find(b,13);
    }
    static void find(int []a,int value){
        for(int i=0;i<a.length;i++){
            if(a[i]==value){
                System.out.println("Found numnber !! "+value+" at index "+i);
                return;
            }
        }
        System.out.println(value+" Element not found!!");
    }
}