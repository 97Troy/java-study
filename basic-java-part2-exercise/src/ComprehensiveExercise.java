import java.util.Scanner;

public class ComprehensiveExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int price = scan.nextInt();
        System.out.println("请输入机票月份：");
        int month = scan.nextInt();
        System.out.println("请输入是头等舱还是经济舱：");
        String seat = scan.next();
        double finalPrice = ticketPrice(price, month, seat);
        System.out.println("最终机票价格是" + finalPrice);
    }

    public static double ticketPrice(int originPrice, int month, String seat){
        double price = originPrice;
        if (month > 5 && month < 10){
            if (seat.equals("头等舱")){
                price = originPrice * 0.9;
            }else if(seat.equals("经济舱")){
                price = originPrice * 0.85;
            }else{
                System.out.println("座位输入错误，请选择头等舱或者经济舱");
            }
        }else if(month <= 4 || month >=11){
            if (seat.equals("头等舱")){
                price = originPrice * 0.7;
            }else if(seat.equals("经济舱")){
                price = originPrice * 0.65;
            }else{
                System.out.println("座位输入错误，请选择头等舱或者经济舱");
            }
        }else{
            System.out.println("录入的月份有问题，请输入1-12月");
        }

        return price;
    }

}
