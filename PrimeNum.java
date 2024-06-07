public class PrimeNum {
    public static void main(String[] args) {
        //System.out.println(isPrimeinRange(19));
        isPrimeinRange(10);
    }

    static void isPrimeinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
