package EX11_01;
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        this(1.0, 1.0, 1.0);
    }
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    protected double getside1(){
        return side1;
    }
    protected double getside2(){
        return side2;
    }
    protected double getside3(){
        return side3;
    }


    protected double getArea (){
        double p = getPerimeter() / 2;
        double area = (p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }
    protected double getPerimeter (){
        return side1 + side2 + side3;
    }
    public String toString(){
        return super.toString() + "\nTriangle : side1 = " + side1
                + ", side2 = " + side2
                + ", side3 = " + side3;
    }
}

