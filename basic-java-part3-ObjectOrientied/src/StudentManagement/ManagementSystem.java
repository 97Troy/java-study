package StudentManagement;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ManagementSystem {//管理系统测试
    private static List<Student> STUDENT;
    private static List<Subject> SUBJECT;
    private static List<Score> SCORE;
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while(true){
            System.out.println("---------欢迎来到学生管理系统---------");
            System.out.println("           1.添加学生信息");
            System.out.println("           2.删除学生信息");
            System.out.println("           3.修改学生信息");
            System.out.println("           4.查看学生信息");
            System.out.println("           5.退出");
            Scanner scan = new Scanner(System.in);
            String index = scan.next();
            switch (index){
                case "1":
                    insert(list);
                    break;
                case "2":
                    delete(list);
                    break;
                case "3":
                    update(list);
                    break;
                case "4":
                    query(list);
                    break;
                case "5":
                    System.out.println("退出成功");
                    return;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }

    //1.录入学生信息
    public static void insert( ArrayList<Student> list){
        Student student = new Student();
        Scanner scan = new Scanner(System.in);
        String id = null;

        while(true){//输入Id
            System.out.println("请输入学生id");
            id = scan.next();
            boolean flag = contains(id,list);//查看id是否存在
            if(flag){
                System.out.println("id已经存在，请重新输入");
            }else{
                student.setSid(id);
                break;
            }
        }

        //输入学生姓名
        System.out.println("请输入学生姓名：");
        String name = scan.next();
        student.setName(name);

        //输入学生年龄
        System.out.println("请输入学生年龄");
        while (true){
            try {
                int age = scan.nextInt();
                student.setAge(age);
                break;
            }catch (InputMismatchException e){
                System.out.println("请输入数字");
                scan.nextLine();
            }
        }

        //输入学生地址
        System.out.println("请输入学生地址");
        String address = scan.next();
        student.setAddress(address);

        //添加信息
        list.add(student);
    }

    //2.删除学生信息
    public static void delete(ArrayList<Student> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要删除的学生id:");
        String id = scan.next();
        int index = getIndex(id,list);
        if (index >= 0){
            list.remove(index);
            System.out.println("已经成功删除学号为" + id + "的所有信息");
        }else{
            System.out.println("删除失败，您输入的学号不存在");
        }
    }

    //3.修改信息
    public static void update(ArrayList<Student> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要修改的学生id");
        String id = scan.next();
        int index = getIndex(id,list);
        if (index >= 0){
            System.out.println("请输入需要修改的学生姓名:");
            String name = scan.next();
            list.get(index).setName(name);

            System.out.println("请输入需要修改的学生年龄:");
            while (true) {
                try {
                    int age = scan.nextInt();
                    list.get(index).setAge(age);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("请输入数字");
                    scan.nextLine();
                }
            }


            System.out.println("请输入需要修改的学生家庭地址:");
            String address = scan.next();
            list.get(index).setAddress(name);

            System.out.println("信息修改成功");
        }else {
            System.out.println("修改失败，您输入的学号不存在");
        }
    }

    //4.查询信息
    public static void query(ArrayList<Student> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择查询方式：1.查询所有学生信息 2.按照id查询学生信息");
        String choose = scan.next();
        switch(choose){
            case "1":
                System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
                for (int i = 0; i < list.size(); i++) {
                    Student student = list.get(i);
                    System.out.println(student.getSid() + "\t\t" + student.getName()+"\t\t" + student.getAge() + "\t\t" + student.getAddress());
                }
                break;
            case "2":
                System.out.println("请输入学生id：");
                String id = scan.next();
                int index = getIndex(id,list);
                if (index >= 0){
                    System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
                    Student student = list.get(index);
                    System.out.println(student.getSid() + "\t\t" + student.getName()+"\t\t" + student.getAge() + "\t\t" + student.getAddress());
                }else {
                    System.out.println("无当前学生信息，请确认或添加后再查询");
                }
                break;
            default:
                System.out.println("没有当前选项，请确认后再选择");
        }

    }
    //查看信息是否存在
    public static boolean contains(String str, ArrayList<Student> list){
        return getIndex(str,list) >= 0;
    }

    //通过id获取索引
    public static int getIndex(String id, ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (id.equals(student.getSid())){
                return i;
            }
        }
        return -1;
    }
}


