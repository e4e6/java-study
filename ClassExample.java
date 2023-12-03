class Circle {
    final static double PI = 3.141592;
    double radius;
    Circle(){
        this.radius = 1;
    }
    Circle(double radius){
        this.radius = radius;
    }
    double getArea(){
        return radius*radius*PI;
    }
    double getCircumference(){
        return radius*2*PI;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println(circle.getArea());
    }
}