
public class ThisMethod {
    public static void main(String[] args) {
        Korean han = new Korean("이름","아이디");
        System.out.println(han.nation);
        System.out.println(han.name);
        System.out.println(han.id);
    }
}
class Korean {
    Korean(String name, String id){
        this.name = name;
        this.id = id ;
    }
    String nation = "Korea";
    /* 
     * String nation;
     * nation = "Korea";
     * ^^^^^^^^^^^^^^^^^^ 허용되지 않음
     * Java에서는 클래스 레벨에서 변수를 선언할 때, 변수를 초기화하거나 값을 할당하는 것은 허용되지 않음
     * 이후에 값을 할당하거나 초기화하는 작업은 생성자, 초기화 블록, 또는 메서드 안에서 이루어져야함
    */

    String name = "name";
    String id = "id";
}
