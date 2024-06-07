public class BinaryToDecimal {
   public static void main(String[] args) {
    toDecimail(100);
   }
   static void toDecimail(int binNum){
    int power=0;
    int decimal=0;
    while(binNum>0){
        int lastDidit=binNum%10;
        decimal=decimal+lastDidit*(int)Math.pow(2,power);
        power++;
        binNum=binNum/10;
    }
    System.out.print(decimal);
   }
}
