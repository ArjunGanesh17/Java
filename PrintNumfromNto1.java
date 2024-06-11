public class PrintNumfromNto1 {

    public static void printNum(int num){
        if(num==1){
            System.out.println(1);
            return;
        }
        
        printNum(num-1);
        System.out.println(num);
    }

    public static int factorial(int n){
        //Base Case
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    //printing the sum of first natural numbers
    public static int printNaturalNum(int n){
        if(n==1){
            return 1;
        }
        return n+printNaturalNum(n-1);
    }
    //fibonacci problem
    public static int fibo(int n){
        if(n==1 ||n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    //power problem
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }

    //sorted array or not
    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    //first time occurence of number in tj=he array
    public static int firstOccurence(int[] arr,int target,int i){
        //Base case
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return firstOccurence(arr,target,i+1);
    }

    // power of number
    public static int power(int x,int n){
        if(n==0){
            return 0;
        }
        return x*pow(x, n-1);
    }

    //optimized powe
    public static int optimizedPower(int a,int b){
        if(b==0){
            return 1;
        }
        int half=optimizedPower(a, b/2)*optimizedPower(a, b/2);
        if(b%2!=0){
            half=a*half;
        }
        return half;
    }
    public static void main(String[] args) {
        //printNum(10);
        //System.out.println(factorial(5));
        //System.out.println(printNaturalNum(10));
        //System.out.println(fibo(7));
       // System.out.println(pow(2,10));
       //int[] arr={1,2,3,5,2};
       //System.out.println(isSorted(arr, 0));
       int[] arr={6,3,2,5,7,9,5,3};
       //System.out.println(firstOccurence(arr,5,0));
      //System.out.println(pow(2, 5));
      System.out.println(optimizedPower(2, 5));
    }

   
}
