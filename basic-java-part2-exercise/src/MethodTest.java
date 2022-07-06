public class MethodTest {
    public static void main(String[] args) {
        int a = 10, b =10;
        byte a1 = 10, b1 = 10;
        long a2 = 10L, b2 = 15L;
        short a3 = 10, b3 = 10;
        boolean judge = compare(a,b);
        boolean judge1 = compare(a1,b1);
        boolean judge2 = compare(a2,b2);
        boolean judge3 = compare(a3,b3);
        System.out.println(judge);
        System.out.println(judge1);
        System.out.println(judge2);
        System.out.println(judge3);
    }

    public static boolean compare(int a, int b){
        System.out.println("int");
        return  a == b;

    }

    public static boolean compare(byte a, byte b){
        System.out.println("byte");
        return  a == b;
    }

    public static boolean compare(long a, long b){
        System.out.println("long");
        return  a == b;
    }

    public static boolean compare(short a, short b){
        System.out.println("short");
        return  a == b;
    }
}
