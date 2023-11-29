package week12;

public class p3 {
   public static void main(String[] args) {
      Bird eagleFly = new Bird() {
         @Override
         public void move() {
            System.out.println("독수리가 날아가요~~");
         }
      };
      eagleFly.move();
   }
}