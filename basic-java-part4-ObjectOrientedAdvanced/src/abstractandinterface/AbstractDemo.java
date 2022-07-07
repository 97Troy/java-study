package abstractandinterface;

abstract class AbstractDemo {
    public static void show(){
        System.out.println("这是一个静态方法");
    }
    public abstract void run();
}

class Demo {
    public static void main(String[] args) {
        //AbstractDemo a = new AbstractDemo();错误
        AbstractDemo.show();
    }
}
