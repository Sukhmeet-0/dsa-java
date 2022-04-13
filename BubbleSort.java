public class BubbleSort {
    public static void main(String[] args) {
        int [] a={1,56,3,93,9,-4};
        int temp,i,j;
        for(i=a.length-1;i>0;i--){
            for(j=0;j<i;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int w = 0;w<a.length-1;w++){
            System.out.println(a[w]);
        }
    }
}
