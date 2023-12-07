package week13;

class Shape {}
class Rectangle extends Shape {}
class Circle extends Shape {}
public class p3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException 발생: " + e.getMessage());
            // 예외 처리를 원하는 대로 수행
        }
    }
    static void casting(Shape s) {
        Circle c = (Circle) s; // ClassCastException 발생
      
    }
}