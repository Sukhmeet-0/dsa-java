public class Interview8 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={0,1,4,9};
        comp(a,b);
    }
    static void comp(int []a,int []b){
        for(int i=0;i<a.length;i++){// ---------------->O(a)-------------]
                                                                    //   ]----------->O(ab)
            for(int j=0;j<b.length;j++){// ------------>O(b)-------------]
                if(a[i]<b[j]){
                    System.out.println(a[i]+" "+b[j]);
                }
            }
        }
    }
}
// TIME COMPLEXITY

//  O(ab)