public class LargestNumberIn2DArrays {
    public static void main(String[] args) {
        int[][] arr={{10,2,3},{4,5,6},{7,8,9}};
        System.out.println(minNumSearch(arr));
        System.out.println(maxNumSearch(arr));
        
    }
    public static int maxNumSearch(int[][] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        return largest;
    }
 
    public static int minNumSearch(int[][] arr){
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<largest){
                    largest=arr[i][j];
                }
            }
        }
        return largest;
    }    
}
