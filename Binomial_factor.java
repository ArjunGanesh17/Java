
public class Binomial_factor {
        public static void main(String[] args) {
           System.out.println(Binocoef(10,5));
        }

        static int Binocoef(int n,int r){
           int fact_n=factorial(n);
           int fact_r=factorial(r);
           int fact_nmr=factorial(n-r);

           int res=fact_n/(fact_r*fact_nmr);
           return res;
        }

        static int factorial(int n){
            int fact=1;
            for(int i=n;i>0;i--){
                fact=fact*i;
            }
            return fact;
        }
}
