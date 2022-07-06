package ObjectExercise;

public class PhoneDemo1Test {
    public static void main(String[] args) {
        PhoneDemo1 p1 = new PhoneDemo1();
        p1.brand = "iphone";
        p1.price = 1999;
        System.out.println(p1.price);
        System.out.println(p1.brand);
        p1.call();
        p1.sendMessage();

        PhoneDemo1 p2 = p1;
        System.out.println(p2.price);
        System.out.println(p2.brand);
        p2.call();
        p2.sendMessage();

        p2.price = 2001;
        p2.brand = "Magic";
        System.out.println(p2.price);
        System.out.println(p2.brand);
        System.out.println(p1.price);
        System.out.println(p1.brand);


    }
}
