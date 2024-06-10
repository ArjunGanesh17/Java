public class Strings {


    public static void isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Not a Palindrome");
            }
        }

        System.out.println("Palindrome");
    }
    /*
      Given a Route containing 4 directions (E,W,N,S).Find the shortest path to reach destination 

     */
    public static double shortestPath(String str){
        int x=0,y=0;
        //East
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='E'){
            x++;
        }
        //West
        else if(str.charAt(i)=='W'){
            x--;
        }
        //North
        else if(str.charAt(i)=='N'){
            y++;
        }
        //South
        else{
            y--;
        }
     }
     int X2=x*x;
     int Y2=y*y;
     return Math.sqrt(X2+Y2); 
    }

    //for a give set of strings print the largest strings
    public static String largestString(String[] fruits){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }
    //for a given String convert each first letter of each word to upper case
    //hi i am arjun
    //o/p Hi I Am Arjun
    static String toUPPer(String str){
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //String compression
    //i/p aaaabbbccdd
    //o/p a4b3c2d2
    public static String toCompression(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        // String firstName="Arjun";
        // String lastName="Reddy";
        // System.out.println(firstName+" " +lastName);
       // System.out.println(firstName.charAt(4));
       //isPalindrome("madam");
       // String str="WNEENESENNN";
       //System.out.println(shortestPath(str));

       //String Comparision
        //  String s1="Tony";
        //  String s2=new String("Tony");
       //  System.out.println(s1==s2);        //false
       //  System.out.println(s1.equals(s2));  //true
        // String[] fruits={"apple","banana","arange","lemon","mango"};
        // System.out.println(largestString(fruits));
        //StringBuilder
        // StringBuilder sb=new StringBuilder("");
        // char ch='a';
        //     for(int i=1;i<27;i++){
        //         sb.append(ch);
        //         ch++;
        //     }
        //     System.out.println(sb);
        // String str="i am arjun ganesh";
        // System.out.println(toUPPer(str));
        String str="aaaabbbccdd";
        System.out.println(toCompression(str));

    }


}
