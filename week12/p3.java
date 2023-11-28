package week12;
interface Bird {
    void move();
}
public class p3 {
    void move() {
        System.out.println("새가 움직인다~~~.");
        }
   public static void main(String[] args) {
      Bird b = new Bird() {
         public void move() {
            System.out.println("독수리가 날아가요~~");
         }
      };
      b.move();
   }
}
