package StringDemo;

public class Test9 {
    public static void main(String[] args) {
        //1.定义一个变量表示骂人的话
        String talk = "后裔你玩什么啊，TMD";


      String result = talk.replace("TMD","***");

        //3.打印
        System.out.println(talk);
        System.out.println(result);
    }
}
