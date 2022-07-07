package abstractandinterface;

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer01.Inner01 in = new Outer01.Inner01("张三");
        in.showName();
    }
}

class Outer01{
    private static String scName = "name";
    public static class Inner01{
        private String name;
        public Inner01(String name){
            this.name = name;
        }

        public void showName(){
            System.out.println(this.name);
            System.out.println(scName);
        }
    }
}
