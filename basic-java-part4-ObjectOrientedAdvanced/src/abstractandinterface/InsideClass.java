package abstractandinterface;

public class InsideClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner oi= new Outer().new Inner();
        oi.method();
        NewOuter no = new NewOuter();
        System.out.println(no.getInstance());
    }
}

class Outer{
    public class Inner{
        public void method(){
            System.out.println("调用内部类");
        }
    }
}

class NewOuter{
    String name = "初始";
    private class Inner{
        String name1 = name;
        int a = 10;
    }
    public Inner getInstance(){
        return new Inner();
    }
}