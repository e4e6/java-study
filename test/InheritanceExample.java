
class Circle {
    public void findRadius() {
        System.out.println("반지름  ");
    }
}
class People{
    public void printMyself(){
        System.out.println("이름 ");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        People people = new People();
        people.printMyself();
        circle.findRadius();
    }
}