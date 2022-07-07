package abstractandinterface;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.show();
    }
}

class Outer2{
    public void show(){
        class Inner{
            public String name;
            public void show(){
                System.out.println("这是方法内部类调用");
            }
        }
    }
}