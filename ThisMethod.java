public class ThisMethod {
    public static void main(String[] args) {
        Korean han = new Korean("이름");

        System.out.println(han.nation);
        System.out.println(han.name);
        System.out.println(han.id);
    }
}

class Korean {
    /* 
     * String nation;
     * nation = "Korea";
     * ^^^^^^^^^^^^^^^^^^ 이렇게 작성하는 건 허용되지 않음
     * 
     * Java에서는 클래스 레벨에서 변수를 선언할 때, 변수를 초기화하거나 값을 할당하는 것은 허용되지 않음
     * 이후에 값을 할당하거나 초기화하는 작업은 생성자, 초기화 블록, 또는 메서드 안에서 이루어져야함
    */
    String nation = "Korea";
    String name = "name";
    String id = "id";

    /* public Korean(String name, String id){
        this.name = name;
        this.id = id ;
    }
    ^^^^^^^^^^^^^^ 코드가 존재하지 않는 경우에 오류 발생

    Korean han = new Korean("이름");과 같이 Korean 객체를 생성할 때, 
    public Korean(String name) 생성자가 호출되기 위해서는 Korean(String name, String id) 생성자가 명시적으로 정의되어 있어야 한다. 
    그렇지 않을 경우에는 해당 생성자를 찾을 수 없다는 컴파일 오류가 발생.

    애초에 this()는 같은 클래스 내에서 다른 생성자를 호출하는 데 사용됨

    즉 this() 메서드를 사용하려면 동일한 클래스 내에 다른 생성자가 존재해야함.
    */
    public Korean(String name, String id){
        this.name = name;
        this.id = id ;
    }
    public Korean(String name){
        this(name,"id"); 
    }
}
