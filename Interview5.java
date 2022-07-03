// sum of product of arrays and its complexity
public class Interview5 {
    public static void main(String[] args) {
        int [] customarray={1,3,4,5};
        spofArray(customarray);
    }
    static void spofArray(int [] array){
        int sum=0;//---------------------->O(1)
        int product=1 ;//---------------------->O(1)
        for(int i=0;i<array.length;i++){//--------------------->O(n)
            sum+=array[i];
        }
        for(int j=0;j<array.length;j++){//---------------------->O(n)
            product*=array[j];
        }
        System.out.println(sum+" "+product);//------------------>O(1)
    }
}

//      TIME COMPLEXITY
// O(1)+O(1)+O(n)+O(n)+O(1) = O(n)