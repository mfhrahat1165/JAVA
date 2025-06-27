class Shape {
// Area of rectangle
double area(double length, double width) 
{ 
    return length * width;
}

// Area of circle
double area(double radius) 
{
    return 3.1416 * radius * radius;
}
}

public class task2 {
public static void main(String[] args) {
    Shape s = new Shape();
    System.out.println("Area of Rectangle: " + s.area(4.08, 4.17)); 
    System.out.println("Area of Circle: " + s.area(3.75));
}
}