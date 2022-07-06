package ObjectArray;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        Phone p1 = new Phone("小米",1999,"白色");
        Phone p2 = new Phone("华为",4999,"蓝色");
        Phone p3 = new Phone("魅族",3999,"红色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        System.out.println(p1.avgPrice(phones));
    }
}
