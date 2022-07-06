package staticandinheritance;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println(StaticDemo.staticName);
        StaticDemo.staticName = "静态成员变量";
        System.out.println(StaticDemo.staticName);
        StaticDemo staticDemo = new StaticDemo();//实例化
        staticDemo.study();
        StaticDemo.study();
    }
}
