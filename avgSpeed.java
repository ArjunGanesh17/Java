/* (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
*/
public class avgSpeed {
    public static void main(String[] args) {
        double km=14;
        double time =0.75833;
        double miles = (km/time)*1.6;
        System.out.println(miles);
    }
    
}
