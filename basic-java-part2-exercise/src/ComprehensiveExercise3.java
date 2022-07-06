import java.util.Random;

public class ComprehensiveExercise3 {
    public static void main(String[] args) {
        Random r = new Random();
        String result = "";
        for(int i = 1; i <= 4; i++){
            result = result + getChar(r.nextInt(52));
        }
        result += r.nextInt(10);
        System.out.println(result);

    }

    public static char getChar(int index){
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if(i <= 25){
                //添加小写字母
                chs[i] = (char)(97 + i);
            }else{//27
                //添加大写字母
                // A --- 65
                chs[i] = (char)(65 + i - 26);
            }
        }
        return chs[index];
    }

}
