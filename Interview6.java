// print pairs of given array and find its complexity
public class Interview6 {
    public static void main(String[] args) {
        int [] custom={1,2,3,4};
        pairsOfArray(custom);
    }
    static void pairsOfArray(int [] array){
        for(int i=0;i<array.length;i++){//------------------>O(n)   -----]
            //                                                           ]-------------->O(n^2)       
            for(int j=0;j<array.length;j++){//------------------->O(n)---]
                System.out.print(array[i]+" , "+array[j]);//-------------->O(1)
            }
            // System.out.println();
        }
    }
}

//          TIME COMPLEXITY
//  O(n^2)
