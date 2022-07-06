package StringDemo;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你想要说的话");
        String talk = scan.next();
        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }

        System.out.println(talk);
    }
}
