package abstractandinterface;

public class InnerClassDemo2 {
}

interface Swim{
    void swimming();
}

class Test{
    public static void main(String[] args) {
        new Swim(){
            @Override
            public void swimming() {
                System.out.println("自由泳");
            }
        }.swimming();

        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("蛙泳");
            }
        };
        s2.swimming();
        s2.swimming();
    }
}