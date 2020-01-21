/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[] {
            new Rectangle(2,5,"Rectangle 1"),
            new Rectangle(5, 6, "Rectangle 2"),
            new Rectangle(2,7,"Rectangle 3"),  
        };


        //displays information regarding the rectangle objects initialized in the array above.
        for (int i = 0; i<rectangles.length;i++)
        {
            System.out.println(rectangles[i]);
        }

        //displays the area of all rectangles in the above array
        for (int i=0;i<rectangles.length;i++)
        {
            System.out.println("The area of " + rectangles[i].getName() + " is " + rectangles[i].area() + " inches\n");
        }

        //displays the perimeter of all rectangles in the above array
        for (int i=0;i<rectangles.length;i++)
        {
            System.out.println("The perimeter of " + rectangles[i].getName() + " is " + rectangles[i].perimeter() + " inches\n");
        }

    
    }
}