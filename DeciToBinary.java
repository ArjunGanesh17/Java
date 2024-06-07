public class DeciToBinary {
    public static void main(String[] args) {
        deciToBin(10);
    }
    static void deciToBin(int n){
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum+=rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("Binary num is : "+binNum);
    }
}
