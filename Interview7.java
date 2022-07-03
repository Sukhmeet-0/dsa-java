public class Interview7 {
    public static void main(String[] args) {
        int []a={1,3,4,5};
        unorderedPair(a);
    }
    static void unorderedPair(int [] a){
        for(int i=0;i<a.length;i++){//-------------------->O(n)
            for(int j=i+1;j<a.length;j++){//-------------->O(n(n-1)/2)= O(n^2)
                System.out.println(a[i]+","+a[j]);
            }
        }
    }
}
//      TIME COMPLEXITY
// O(n^2)