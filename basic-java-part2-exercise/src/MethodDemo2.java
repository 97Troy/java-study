public class MethodDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        getMax(a,b);
        int max = getMax(a,b);
        System.out.println(max);

        double sum1 = getSum(10,20,30);
        double sum2 = getSum(11.2,22.3,11.2);
        double sum3 = getSum(11,4.5,32.2);
        double sum4 = getSum(6.9,9.4,7.8);
        double  sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);

    }

    public static int getMax(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static double getSum(double month1, double month2, double month3){
        return month1+month2+month3;
    }


}

