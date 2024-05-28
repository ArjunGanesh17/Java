public class FibonacciRecurssion {
    public static void main(String[] args) {
       int ans= fibo(5);
       System.out.println(ans);
    }
    static int fibo(int n){
        //Base Conditions
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }

}
