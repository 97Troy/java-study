package ManagementSystemDemo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        ArrayList<StudentDemo> list = new ArrayList<>();
        startSystem(list);
    }

    public static void startSystem(ArrayList<StudentDemo> list) {
        System.out.println("---------欢迎使用学生成绩管理系统---------");
        String choose = "1";
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("          1.添加学生成绩信息");
            System.out.println("          2.删除学生成绩信息");
            System.out.println("          3.修改学生成绩信息");
            System.out.println("          4.查询学生成绩信息");
            System.out.println("          0.退出");
            choose = scan.next();
            switch (choose) {
                case "1"://插入信息
                    insert(list);
                    System.out.println("请继续选择功能：");
                    break;
                case "2"://删除信息
                    delete(list);
                    System.out.println("请继续选择功能：");
                    break;
                case "3"://修改信息
                    update(list);
                    System.out.println("请继续选择功能：");
                    break;
                case "4"://查询信息
                    query(list);
                    System.out.println("请继续选择功能：");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("没有这个选项，请确认后重新输入");
            }
        }
    }

    //1.插入学生信息
    public static void insert(ArrayList<StudentDemo> list) {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        StudentDemo studentDemo = new StudentDemo();
        System.out.println("请输入学生学号：");
        while (true) {
            String id = scan.next();
            flag = contains(id, list);
            if (flag) {
                System.out.println("当前学号以存在，请重新输入：");
            } else {//没重复，插入学生id
                studentDemo.setSid(id);
                break;
            }
        }
        //插入学生姓名
        System.out.println("请输入学生姓名：");
        String name = scan.next();
        studentDemo.setName(name);
        //插入成绩
        System.out.println("请输入学生英语成绩：");
        while (true) {
            try {
                double englishScore = scan.nextDouble();
                if (englishScore >= 0 && englishScore <= 100) {
                    studentDemo.setEnglishScore(englishScore);
                    break;
                } else {
                    System.out.println("分数输入错误，请重新输入：");
                    scan.nextLine();//将当前行多余输入消除
                }
            } catch (InputMismatchException e) {
                System.out.println("分数输入错误，请重新输入：");
                scan.nextLine();
            }
        }

        System.out.println("请输入学生数学成绩：");
        while (true) {
            try {
                double mathScore = scan.nextDouble();
                if (mathScore >= 0 && mathScore <= 100) {
                    studentDemo.setMathScore(mathScore);
                    break;
                } else {
                    System.out.println("分数输入错误，请重新输入：");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("分数输入错误，请重新输入：");
                scan.nextLine();
            }
        }

        System.out.println("请输入学生语文成绩：");
        while (true) {
            try {
                double chineseScore = scan.nextDouble();
                if (chineseScore >= 0 && chineseScore <= 100) {
                    studentDemo.setChineseScore(chineseScore);
                    break;
                } else {
                    System.out.println("分数输入错误，请重新输入：");
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("分数输入错误，请重新输入：");
                scan.nextLine();
            }
        }

        list.add(studentDemo);
        System.out.println("学生信息录入成功！");
    }

    //2.删除学生信息
    public static void delete(ArrayList<StudentDemo> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要删除学生的学号：");
        while (true) {
            String id = scan.next();
            if (id.equals("0")) {//退出
                return;
            } else {
                int index = getIndex(id, list);//判断学生是否存在
                if (index >= 0) {
                    list.remove(index);
                    System.out.println("学号为" + id + "的学生信息已经删除");
                    break;
                } else {
                    System.out.println("输入的学号不存在，请检查后重新输入（退出删除功能请输入0）");
                    scan.nextLine();
                }
            }


        }
    }

    //3.修改学生信息
    public static void update(ArrayList<StudentDemo> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要修改学生的学号：");
        while (true) {
            String id = scan.next();
            if (id.equals("0")) {//退出
                return;
            } else {
                int index = getIndex(id, list);
                if (index >= 0) {
                    System.out.println("请输入修改后的学生姓名：");
                    String name = scan.next();
                    list.get(index).setName(name);

                    System.out.println("请输入修改后的英语成绩：");
                    while (true) {
                        try {
                            double englishScore = scan.nextDouble();
                            if (englishScore >= 0 && englishScore <= 100) {
                                list.get(index).setEnglishScore(englishScore);
                                break;
                            } else {
                                System.out.println("分数输入错误，请重新输入：");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("分数输入错误，请重新输入：");
                            scan.nextLine();
                        }
                    }

                    System.out.println("请输入修改后的数学成绩：");
                    while (true) {
                        try {
                            double mathScore = scan.nextDouble();
                            if (mathScore >= 0 && mathScore <= 100) {
                                list.get(index).setMathScore(mathScore);
                                break;
                            } else {
                                System.out.println("分数输入错误，请重新输入：");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("分数输入错误，请重新输入：");
                            scan.nextLine();
                        }
                    }

                    System.out.println("请输入修改后的语文成绩：");
                    while (true) {
                        try {
                            double chineseScore = scan.nextDouble();
                            if (chineseScore >= 0 && chineseScore <= 100) {
                                list.get(index).setChineseScore(chineseScore);
                                break;
                            } else {
                                System.out.println("分数输入错误，请重新输入：");
                                scan.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("分数输入错误，请重新输入：");
                            scan.nextLine();
                        }
                    }
                    System.out.println("修改成功！");
                    break;
                } else {
                    System.out.println("学号输入错误，请确认后重新输入(退出修改功能请输入0)");
                    scan.nextLine();
                }
            }
        }
    }

    //4.查询学生成绩信息
    public static void query(ArrayList<StudentDemo> list) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请选择查询方式：1.查询全部学生的成绩 2.按学号查询学生成绩 0.退出查询功能");
        while (true) {
            String choose = scan.next();
            switch (choose) {
                case "1":
                    queryAll(list);
                    System.out.println("请继续选择查询方式：1.查询全部学生的成绩 2.按学号查询学生成绩 0.退出查询功能");
                    break;
                case "2":
                    querySid(list);
                    System.out.println("请继续选择查询方式：1.查询全部学生的成绩 2.按学号查询学生成绩 0.退出查询功能");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("没有该选项，请重新选择：1.查询全部学生的成绩 2.按学号查询学生成绩 0.退出查询功能");
            }
        }

    }

    //4.1查询所有学生成绩
    public static void queryAll(ArrayList<StudentDemo> list) {
        System.out.println("id\t\t姓名\t\t英语成绩\t\t数学成绩\t\t语文成绩");
        for (int i = 0; i < list.size(); i++) {
            StudentDemo studentDemo = list.get(i);
            System.out.println(studentDemo.getSid() + "\t\t" + studentDemo.getName() + "\t\t" + studentDemo.getEnglishScore() + "\t\t" + studentDemo.getMathScore() + "\t\t" + studentDemo.getChineseScore());
        }
    }

    //4.2按学号查询学生成绩
    public static void querySid(ArrayList<StudentDemo> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要查询的学生学号：");
        while(true){
            String sid = scan.next();
            if (sid.equals("0")){//退出
                break;
            }else {
                int index = getIndex(sid, list);
                if (index >= 0) {
                    StudentDemo studentDemo = list.get(index);
                    System.out.println("id\t\t姓名\t\t英语成绩\t\t数学成绩\t\t语文成绩");
                    System.out.println(studentDemo.getSid() + "\t\t" + studentDemo.getName() + "\t\t" + studentDemo.getEnglishScore() + "\t\t" + studentDemo.getMathScore() + "\t\t" + studentDemo.getChineseScore());
                    System.out.println("继续输入要查询的学生学号（或输入0退出）");
                } else {
                    System.out.println("学号输入错误，请确认后重新输入(或输入0退出）");
                    scan.nextLine();
                }
            }
        }
    }

    //根据id判断是否存在学生
    public static boolean contains(String id, ArrayList<StudentDemo> list) {
        return getIndex(id, list) >= 0;
    }

    //根据id检索学生索引
    public static int getIndex(String id, ArrayList<StudentDemo> list) {
        for (int i = 0; i < list.size(); i++) {
            StudentDemo studentDemo = list.get(i);
            String sid = studentDemo.getSid();
            if (id.equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
