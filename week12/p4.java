package week12;

public class p4 {
   public static void main(String[] args) {
      class b extends Bird {
         @Override
         void move() {
             System.out.println("독수리가 난다.~~");
         }
      };
      Bird b = new b();
      b.move();
   }
}