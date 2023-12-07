package week13;

public class p2 {
    public static void main(String[] args) {
        // MyDate d = null; NullPointerException 발생
        MyDate d = new MyDate();
        System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
    }
}

class MyDate {
    int year = 2035;
    int month = 12;
    int day = 25;
}