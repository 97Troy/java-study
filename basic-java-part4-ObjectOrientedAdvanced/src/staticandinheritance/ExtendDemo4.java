package staticandinheritance;

public class ExtendDemo4 {
    public static void main(String[] args) {
        Zi2 zi = new Zi2();
        zi.show1();
        zi.show();
    }
}

class Fu2{
    public void show(){
        System.out.println("Fu类中的show方法执行");
    }
}

class Zi2 extends Fu2{
    public void show1() {
        super.show();
    }
    public void show(){
        System.out.println("Zi类中的方法执行");
    }
}
