package stringdemo;

import java.util.Scanner;

public class UserAndPassword {
    public static void main(String[] args) {
        String username = "username";
        String password = "password";

        int i = 3;
        while(i > 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入用户名");
            String inputName = scan.next();
            System.out.println("请输入密码");
            String inputPassword = scan.next();

            if (inputName.equals(username) && inputPassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else if (i == 3){
                System.out.println("用户名或密码输入错误，还有2次机会");
            }else if (i == 2){
                System.out.println("用户名或密码输入错误，还有1次机会");
            }else{
                System.out.println("用户名或密码输入错误，账号已锁定15分钟");
            }
            i--;
        }
    }
}
