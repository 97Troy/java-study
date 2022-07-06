package staticandinheritance;

public class ExtendDemo2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu{
    public int num = 5;
    private int num1 = 10;

    public Fu() {
    }

    public Fu(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
}

class Zi extends Fu {
    private int num2 = 6;
    public String num = "10";
    public Zi (){

    }

    public Zi(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void show() {
        System.out.println(num);
        System.out.println(super.num);
        System.out.println(getNum1());
        System.out.println(num2);
    }
}


