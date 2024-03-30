/* (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
*/
public class speedInKms {
    public static void main(String[] args) {
        double miles=24*1.6;
        double time= 151/120;
        double kms=miles/time;
        System.out.println(kms);
    }
}
