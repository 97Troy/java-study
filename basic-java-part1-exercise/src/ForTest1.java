public class ForTest1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i < 6;i++){
            sum += i;
        }
        System.out.println("求和1-5=" + sum);

        int sum1 = 0;
        for (int i = 1;i < 101;i++){
            if (i % 2 ==0){
                sum1 += i;
            }
        }
        System.out.println("1-100的偶数求和=" + sum1);
    }
}
