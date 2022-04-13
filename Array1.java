class Array1{
    public static void main(String[] args) {
        //x+i*y
        //i is the index , y is the size of element of an array, x is the address of the element
        int [] a=new int[7];
        a[0]=20;
        a[1]=90;
        a[2]=0;
        a[3]=23;
        a[4]=87;
        a[5]=98;
        a[6]=76;
        // a[7]=66;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int index=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==76){
                index=i;
                break;
            }
        }
        System.out.println("Index "+ index);
    }
}