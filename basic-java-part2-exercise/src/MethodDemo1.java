public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        getMax(10,20);
        getMax(a,b);

    }

    public static void getMax(int a, int b){
        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
