public class WhileTest1 {
    public static void main(String[] args) {
        int height = 8844430;
        double paper = 0.1;

        int count = 0;
        while (paper < height){
            paper *= 2;
            count++;
        }

        System.out.println("一张纸对折" + count + "次可以超过珠峰的高度");
    }
}
