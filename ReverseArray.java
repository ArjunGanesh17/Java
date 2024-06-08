public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,4};
        revArr(arr);
        PrintArr(arr);
    }
    static void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void revArr(int[] arr){
        for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
