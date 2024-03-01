class Main{
    public static void main(String[] args){
        int smallest=2;
        int largest =2;
        int [] arr={1,2,3,5,6,4};
        int [] ans= new int[arr.length];
        int i=0,j,temp;
        for(;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("The sorted array is:");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("the smallest element is :"+arr[smallest-1]);
        System.out.println("the largest element is :"+arr[arr.length-largest]);

        smallest=0;
        largest=arr.length-1;
        i=0;
        while(smallest<largest){
            ans[i++]=largest--;
            ans[i++]=smallest++;z
        }
        System.out.print("The large small array is:");
        for(i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}