/*(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
 */
public class Circle {
    public static void main(String args[]){
        float radius = 5.5f;
        float perimeter = 2 * radius * 22/7f;
        float area = radius * radius * 22/7f;
        System.out.println(perimeter);
        System.out.println(area);
    }

}
