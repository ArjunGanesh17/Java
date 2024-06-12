public class RecursionProblems1 {
    
    // Q.1 -> flooering problem
    //Given a 2*n size floor. you have to place 2*1 size tiles to it.
    //find number of ways to to fit the tiles
    public static int floor(int n){
        if(n==0||n==1){
            return 1;
        }
        return floor(n-1)+floor(n-2);  
    }
    //Remove Duplicates in a String
    // appnnnaccooleege
    //apncoleg
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        if(map[ch-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[ch-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(ch), map);
        }
    }

    //Q3 -> single and couple given n find number ways of a person to be single or a pair
    public static int sinlePair(int n){
        if(n==1||n==2){
            return n;

        }
        // int fnm1=sinlePair(n-1);
        // int fnm2=sinlePair(n-2);
        // int tot_fnm2=(n-1)*fnm2;
        // return fnm1+tot_fnm2;
        return sinlePair(n-1)+(n-1)*sinlePair(n-2);
    }
    // Q4-> Binary string Problem no two ones come together
    public static void printBinaryStr(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStr(n-1,0, str+="0");
        if(lastplace==0){
            printBinaryStr(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        //Q1 ->
       // System.out.println(floor(4));
        //Q2 -> Remove Duplicates from the String
       //removeDuplicates("aaarjuanahhihoelakdn", 0, new StringBuilder(""),new boolean[25]);     
        //Q3 ->
        //System.out.println(sinlePair(3));
        //Q4 ->
        printBinaryStr(3, 0, "");

    }
}
