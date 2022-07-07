package polymorphism;

public class FinalDemo {
}



 class Fu{
    public final void show(){
        System.out.println("不可被重写");
    }
}
//class Zi extends Fu {} 报错 无法继承final类

class Zi extends Fu{
    //@Override
    //public void show(){}报错 不可重写
}