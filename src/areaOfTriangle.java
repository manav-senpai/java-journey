import java.util.Scanner;

public class areaOfTriangle {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        // calculate the area of triangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter the width of rectangle in cm:");
        width  = sc.nextDouble();
        System.out.println("Enter the height of rectangle in cm:");
        height  = sc.nextDouble();

        area = height* width;

        System.out.println();
        System.out.println("The area of your rectangel is :" + area + " Sq.cm");




        sc.close();
    }
}