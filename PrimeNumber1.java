public class PrimeNumber1 {
    public static void main(String[] args) {
        int n=97;
        boolean[] arr=new boolean[n+1];
        prime(n,arr);
    }
    static void prime(int n,boolean[] arr){
        for(int i=2;i<=n;i++){
            if(arr[i]==false){
                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(arr[i]==false){
                System.out.print(i+ " ");
            }
        }
    }
}
