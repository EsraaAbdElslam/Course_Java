package EX11_01;
public class TriangleTest {
    public static void main (String[]args){
        Triangle  t = new Triangle(1.0,1.5,1.0);
        t.setFilled(true);
        t.setColor("yellow");
        System.out.println(t.toString() 
                + "\nthe area is " + t.getArea()
                + "\nthe Perimeter is " + t.getPerimeter());
    }
}