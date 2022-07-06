import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r =new Random();
        int number = r.nextInt(100);
        System.out.println(number);
    }
}
