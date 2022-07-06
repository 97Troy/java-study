package ObjectArray;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++){
            Car car = new Car();
            System.out.println("请输入第" + (i + 1) + "台汽车的品牌：");
            String name = scan.next();
            car.setBrand(name);
            System.out.println("请输入第" + (i + 1) + "台汽车的价格：");
            double price = scan.nextDouble();
            car.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "台汽车的颜色：");
            String color = scan.next();
            car.setColor(color);
            cars[i] = car;
        }
        for (Car car:cars){
            car.show();
        }
    }
}
