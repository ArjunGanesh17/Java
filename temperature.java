/*Q1: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
 */
import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius");
        double celsius =ob.nextDouble();
        double Farhen =( (9*celsius)/5)+32;
        System.out.println(Farhen);
    }
}
