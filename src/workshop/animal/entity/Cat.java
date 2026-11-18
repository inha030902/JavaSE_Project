package workshop.animal.entity;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name){
        super(4); // 부모 클래스의 기본 생성자가 없으면 생성자를 불러줘야됨
        this.name = name;
    };
    
    public Cat() {
        this("");
    }
}    
