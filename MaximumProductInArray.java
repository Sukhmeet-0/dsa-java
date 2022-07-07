// maximum product of elements in array
public class MaximumProductInArray {
    public static void main(String[] args) {
        int []a={5,3,6,3,7};
        System.out.println(maxProduct(a));
    }
    static String maxProduct(int []b){
        int max=0;
        String pairs="";
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]*b[j]>max){
                    max=b[i]*b[j];
                    pairs=(Integer.toString(b[i])+" , "+ Integer.toString(b[j]));
                }
            }
        }
        System.out.println("Max Product is: "+max);
        return pairs;
    }
}
