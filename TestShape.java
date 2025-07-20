abstract class Shape{
    protected double side,area,perimeter;

    public Shape(double side){
        this.side=side;
    }

    abstract void calculateArea();
    abstract  void calculatePerimeter();

    void display(){
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);
    }
}


class Triangle extends Shape{
    double height;

    public Triangle(double base,double height){
        super(base);
        this.height=height;
    }
    void calculateArea(){
        area=0.5*side*height;
    }
    void calculatePerimeter(){
        perimeter=3*side;
    }
    void display(){
        System.out.println("Traingle:");
        super.display();
    }

}

class Rectangle extends Shape{
    double width;

    public Rectangle(double length,double width){
        super(length);
        this.width=width;
    }
    void calculateArea(){
        area=side*width;
    }
    void calculatePerimeter(){
        perimeter=2*(side+width);
    }
    void display(){
        System.out.println("Rectangle:");
        super.display();
    }

}


public class TestShape{
    public static void main(String args[]){

        Triangle tr=new Triangle(3,2);
        tr.calculateArea();
        tr.calculatePerimeter();
        tr.display();

        Rectangle rect=new  Rectangle(3,2);
        rect.calculateArea();
        rect.calculatePerimeter();
        rect.display();

    }
}