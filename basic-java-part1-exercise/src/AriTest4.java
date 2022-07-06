public class AriTest4 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        a += b;
//        System.out.println(a);
//        System.out.println(b);

        //强制转换
        //a += b == a =(byte) a +b;
        byte a =127;
        byte b = 1;
        a += b;
        System.out.println(a);
        System.out.println(b);

        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println();

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println();

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println();


    }
}
