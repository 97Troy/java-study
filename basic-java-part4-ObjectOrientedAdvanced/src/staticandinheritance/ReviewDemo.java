package staticandinheritance;


/*
修饰符 class 类名 {
     //成员变量
     //成员方法
     //构造方法
}
 */
public class ReviewDemo {
    //成员变量
    public String name;
    public char sex;
    public int age;
}

class TestDemo{
    public static void main(String[] args) {
        ReviewDemo reviewDemo = new ReviewDemo();
    }
}