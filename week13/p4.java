package week13;

public class p4<T> {
    public T max(T a, T b) {
        if (a instanceof Number && b instanceof Number) {
            double doubleA = ((Number) a).doubleValue();
            double doubleB = ((Number) b).doubleValue();
            return doubleA >= doubleB ? a : b;
        } else if (a instanceof String && b instanceof String) {
            String stringA = (String) a;
            String stringB = (String) b;
            return stringA.length() >= stringB.length() ? a : b;
        } else {
            throw new IllegalArgumentException("Arguments must be of type Number or String");
        }
    }
    public static void main(String[] args) {
        p4<Object> max = new p4<>();

        System.out.println(max.max(10.0, 8.0)); 
        System.out.println(max.max(5, 8.0)); 

        System.out.println(max.max("Hello", "Hi")); 
        System.out.println(max.max("Good", "morning")); 
    }
}
