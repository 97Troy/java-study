public class CirculationTest1 {
    public static void main(String[] args) {
        for (int i = 1;i <= 5;i++){
            System.out.println("在吃第" + i + "个包子");
            if (i == 3){
                System.out.println("已经吃了三个包子了，不吃了");
                break;
            }

        }

        for (int i = 1;i <= 5;i++){
            if (i == 3){
                System.out.println("第三个包子坏了不吃");
               continue;
            }
            System.out.println("在吃第" + i + "个包子");


        }
    }
}
