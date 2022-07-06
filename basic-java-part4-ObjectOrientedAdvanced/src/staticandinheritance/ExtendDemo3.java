package staticandinheritance;

public class ExtendDemo3 {
    public static void main(String[] args) {
        Zi1 zi = new Zi1();
        zi.show();
    }
}

class Fu1{
    int num = 5;
}

class Zi1 extends Fu1{
    int num = 6;
    public void show(){
        int num = 1;
        System.out.println("method num = "+ num);
        System.out.println("Zi1 num = "+ this.num);
        System.out.println("Fu num = "+ super.num);
    }
}
