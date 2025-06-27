class Shape {
 
void draw() {

System.out.println("Drawing shape");

}
}
class Circle extends Shape{ 
void draw() {

System.out.println("Drawing Circle");

}
}
class Rectangle extends Shape{
void draw() {

System.out.println("Drawing Rectangle");

}
}
public class task2 {
public static void main(String[] args) 
{ 
    Shape s = new Shape();
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    s.draw();
    c.draw();
    r.draw();
}
}