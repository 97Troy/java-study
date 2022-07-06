package StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        String s = "";
        //拼接左括号
        s = s + "["; //此时是拿着长度为0的字符串，跟[进行拼接，产生一个新的字符串。
        //把新的字符串再赋值给s，此时变量s记录的就是新的字符串"["的地址值

        //下面我想得到数组里面的每一个元素并进行拼接
        //那么就需要遍历数组，得到每一个元素才行
        for (int i = 0; i < arr.length; i++) {
            //假设第一次循环:i = 0 获取的就是0索引上的元素
            //在拼接的时候："[" + 1 + ", " 拼接完毕之后产生一个新的字符串 "[1, "
            //第二次循环：i = 1 获取的就是1索引上的元素
            //在拼接的时候： 此时s就是第一次循环结束后拼接完毕的结果："[1, "
            //在拼接的时候："[1, " + 2 + ", " 拼接完毕之后产生一个新的字符串 "[1, 2, "
            //...
            if(i == arr.length - 1){
                //如果是最后一个元素，那么不需要拼接逗号空格
                s = s + arr[i];
            }else{
                //如果不是最后一个元素，需要拼接元素和逗号空格
                s = s + arr[i] + ", ";
            }
        }

        //等循环结束之后，再拼接最后一个右括号
        s = s + "]";

        return s;

    }
}
