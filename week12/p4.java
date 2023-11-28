package week12;
interface Bird {
    void move();
}
public class p4 {
   public static void main(String[] args) {
      Bird b = new Bird() {
         public void move() {
            System.out.println("독수리가 난다.~~");
         }
      };
      b.move();
   }
}