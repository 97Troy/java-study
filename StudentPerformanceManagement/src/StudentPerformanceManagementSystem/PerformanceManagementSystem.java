package StudentPerformanceManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PerformanceManagementSystem {
    public static int srId = 0;

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();//学生
        ArrayList<Subject> subjects = new ArrayList<>();//科目
        ArrayList<ScoreRecord> scoreRecords = new ArrayList<>();//成绩记录
        startSystem(students, subjects, scoreRecords);
    }

    //管理系统页面
    public static void startSystem(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        java.lang.System.out.println("---------欢迎使用学生成绩管理系统---------");
        String choose = "1";
        Scanner scan = new Scanner(java.lang.System.in);
        while (true) {
            java.lang.System.out.println("          1.添加功能");
            java.lang.System.out.println("          2.删除功能");
            java.lang.System.out.println("          3.修改功能");
            java.lang.System.out.println("          4.查询功能");
            java.lang.System.out.println("          0.退出");
            choose = scan.nextLine();
            switch (choose) {
                case "1"://插入信息
                    insert(students, subjects, scoreRecords);
                    java.lang.System.out.println("请继续选择功能：");
                    break;
                case "2"://删除信息
                    delete(students, subjects, scoreRecords);
                    java.lang.System.out.println("请继续选择功能：");
                    break;
                case "3"://修改信息
                    update(students, subjects, scoreRecords);
                    java.lang.System.out.println("请继续选择功能：");
                    break;
                case "4"://查询信息
                    query(students, subjects, scoreRecords);
                    java.lang.System.out.println("请继续选择功能：");
                    break;
                case "0":
                    return;
                default:
                    java.lang.System.out.println("没有这个选项，请确认后重新输入");
            }
        }
    }

    //1.添加功能
    public static void insert(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择添加功能：1.添加学生信息 2.添加科目信息 3.添加成绩记录 0.退出添加");
        while (true) {
            String choose = scan.nextLine();
            switch (choose) {
                case "1":
                    String flag1 = "1";
                    while (!flag1.equals("0")) {
                        studentInsert(students);//添加学生信息
                        System.out.println("继续添加学生信息请输入任意字符,退出请输入0");
                        flag1 = scan.nextLine();
                    }
                    System.out.println("请选择添加功能：1.添加学生信息 2.添加科目信息 3.添加成绩记录 0.退出添加");
                    break;
                case "2":
                    String flag2 = "1";
                    while (!flag2.equals("0")) {
                        subjectInsert(subjects);//添加课程记录
                        System.out.println("继续添加课程信息请输入任意字符,退出请输入0");
                        flag2 = scan.nextLine();
                    }
                    System.out.println("请选择添加功能：1.添加学生信息 2.添加科目信息 3.添加成绩记录 0.退出添加");
                    break;
                case "3":
                    String flag3 = "1";
                    System.out.println("请输入考试场次：");
                    String no = scan.nextLine();
                    while (!flag3.equals("0")) {
                        scoreRecordInsert(students, subjects, scoreRecords, no);//添加成绩记录
                        System.out.println("继续添加学生成绩请输入任意字符,退出请输入0");
                        flag3 = scan.nextLine();
                    }
                    System.out.println("请选择添加功能：1.添加学生信息 2.添加科目信息 3.添加成绩记录 0.退出添加");
                    break;
                case "0":
                    return;

                default:
                    System.out.println("没有该选项，请确认后再选择：1.添加学生信息 2.添加科目信息 3.添加成绩记录 0.退出添加");
            }
        }
    }

    //1.1添加学生信息
    public static void studentInsert(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入学生学号：");
        while (true) {//判断学号是否存在
            String id = scan.nextLine();
            int index = getStudentIndex(id, students);
            if (index >= 0) {
                System.out.println("当前学号已存在，请重新输入：");
            } else {
                student.setSid(id);
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = scan.nextLine();
        student.setName(name);

        students.add(student);
        System.out.println("学生添加成功!");
    }

    //1.2添加课程信息
    public static void subjectInsert(ArrayList<Subject> subjects) {
        Scanner scan = new Scanner(System.in);
        Subject subject = new Subject();
        System.out.println("请输入科目号：");
        while (true) {//判断课程号是否存在
            String id = scan.nextLine();
            int index = getSubjectIndex(id, subjects);
            if (index >= 0) {
                System.out.println("当前课程号已存在，请重新输入：");
            } else {
                subject.setSubId(id);
                break;
            }
        }
        System.out.println("请输入课程名称");
        String name = scan.nextLine();
        subject.setName(name);

        subjects.add(subject);
        System.out.println("课程添加成功！");

    }

    //1.3添加成绩记录
    public static void scoreRecordInsert(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords, String no) {
        Scanner scan = new Scanner(System.in);
        int subjectSize = subjects.size();
        int studentSize = students.size();
        //判断是否有学生,科目信息
        if (subjectSize == 0) {
            System.out.println("当前没有学科信息录入，请先录入学科信息");
            return;
        }
        if (studentSize == 0) {
            System.out.println("当前没有学生信息录入，请先录入学生信息");
            return;
        }


        String studentName = "";
        String studentId = "";
        System.out.println("请输入学生学号：");
        while (true) {//判断学号是否存在
            String id = scan.nextLine();
            if (id.equals("0")) {//按0退出
                return;
            }

            int index = getStudentIndex(id, students);
            if (index >= 0) {
                studentId = id;
                break;
            } else {
                System.out.println("当前学号不存在，请重新输入：");
            }
        }

        for (ScoreRecord scorerecord : scoreRecords) {//对比考试场次号及学号，判断是否已经录入过成绩
            if (studentId.equals(scorerecord.getStudentId()) && no.equals(scorerecord.getNo())) {
                System.out.println("学号" + studentId + "的" + no + "成绩已经录入完毕，需要修改请选择修改功能");
                return;
            }
        }



        studentName = students.get(getStudentIndex(studentId,students)).getName();//获取学生姓名


        //输入各科成绩，每门科目一条记录
        for (Subject subject : subjects) {
            ScoreRecord scoreRecord = new ScoreRecord();
            scoreRecord.setNo(no);//录入考试场次
            scoreRecord.setStudentId(studentId);//学号存在且该场次未录入成绩，录入学号
            srId++;
            String subjectName = subject.getName();
            String subjectId = subject.getSubId();
            System.out.println("请输入" + studentName + "同学的" + subjectName + "成绩：");
            while (true) {//获取合法分数输入
                try {
                    double score = scan.nextDouble();
                    if (score >= 0 && score <= 150) {
                        scoreRecord.setScore(score);//录入分数
                        scoreRecord.setSubjectId(subjectId);//录入科目Id
                        scoreRecord.setSrId("" + srId);
                        scoreRecords.add(scoreRecord);
                        break;
                    } else {
                        System.out.println("分数输入错误，请重新输入：");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("分数输入错误，请重新输入：");
                }
            }
        }


        System.out.println("成绩录入成功！");
    }

    //2.删除功能
    public static void delete(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择删除功能：1.删除学生信息 2.删除科目信息 3.删除成绩记录 0.退出删除");
        while (true) {
            String choose = scan.nextLine();
            switch (choose) {
                case "1":
                    String flag1 = "1";
                    while (!flag1.equals("0")) {
                        studentDelete(students);//删除学生信息
                        System.out.println("继续删除学生信息请输入任意字符,退出请输入0");
                        flag1 = scan.nextLine();
                    }
                    System.out.println("请选择删除功能：1.删除学生信息 2.删除科目信息 3.删除成绩记录 0.退出删除");
                    break;
                case "2":
                    String flag2 = "1";
                    while (!flag2.equals("0")) {
                        subjectDelete(subjects);//删除课程记录
                        System.out.println("继续删除学生信息请输入任意字符,退出请输入0");
                        flag2 = scan.nextLine();
                    }
                    System.out.println("请选择删除功能：1.删除学生信息 2.删除科目信息 3.删除成绩记录 0.退出删除");
                    break;
                case "3":
                    String flag3 = "1";
                    while (!flag3.equals("0")) {
                        scoreRecordDelete(students, subjects, scoreRecords);//删除成绩记录
                        System.out.println("继续删除学生成绩请输入任意字符,退出请输入0");
                        flag3 = scan.nextLine();
                    }
                    System.out.println("请选择删除功能：1.删除学生信息 2.删除科目信息 3.删除成绩记录 0.退出删除");
                    break;
                case "0":
                    return;

                default:
                    System.out.println("没有该选项，请确认后再选择：1.删除学生信息 2.删除科目信息 3.删除成绩记录 0.退出删除");
            }
        }
    }

    //2.1删除学生信息
    public static void studentDelete(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要删除的学生学号：");
        while (true) {
            String id = scan.nextLine();
            if (id.equals("0")) {//输入0退出循环
                return;
            }

            int index = getStudentIndex(id, students);
            if (index >= 0) {//判断是否有指定学生信息
                System.out.println("成功删除同学" + students.get(index).getName() + "的信息，学号为" + id);
                students.remove(index);
                break;
            } else {
                System.out.println("学号输入错误，没有该同学的信息，请确认后重新输入：");
            }
        }
    }

    //2.2删除课程信息
    public static void subjectDelete(ArrayList<Subject> subjects) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要删除的课程号");
        while (true) {
            String id = scan.nextLine();
            if (id.equals("0")) {//输入0退出
                return;
            }

            int index = getSubjectIndex(id, subjects);
            if (index >= 0) {
                System.out.println("成功删除" + subjects.get(index).getName() + "课程，课程号为" + id);
                subjects.remove(index);
                break;
            } else {
                System.out.println("课程号输入错误，没有该课程的信息，请确认后重新输入：");
            }
        }

    }

    //2.3删除成绩记录
    public static void scoreRecordDelete(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        String studentId = "";
        System.out.println("请输入学生学号：");
        while (true) {//输入学号
            String id = scan.nextLine();
            if (id.equals("0")) {
                return;
            }
            int index = getStudentIndex(id, students);
            if (index >= 0) {
                studentId = id;
                break;
            } else {
                System.out.println("该学生的学号不存在，请确认后重新输入：");
            }
        }

        //定位后删除所有成绩记录
        int initialSize = scoreRecords.size();
        System.out.println("请输入考试场次");
        while (true) {
            String no = scan.nextLine();
            if (no.equals("0")) {//输入0退出
                return;
            }
            for (int i = scoreRecords.size() - 1; i >= 0; i--) {
                if (studentId.equals(scoreRecords.get(i).getStudentId()) && no.equals(scoreRecords.get(i).getNo())) {
                    scoreRecords.remove(i);
                }
            }
            if (initialSize == scoreRecords.size()) {//如果没有删除任何数据
                System.out.println("未找到相关数据，请确认考试场次与学号关联是否有误后重新输入：");
            } else {
                System.out.println("删除成功！已删除学号为" + studentId + "同学的" + no + "的所有成绩记录");
                break;
            }
        }
    }

    //3.修改功能
    public static void update(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择修改功能：1.修改学生信息 2.修改科目信息 3.修改成绩记录 0.退出修改");
        while (true) {
            String choose = scan.nextLine();
            switch (choose) {
                case "1":
                    String flag1 = "1";
                    while (!flag1.equals("0")) {
                        studentUpdate(students);//修改学生信息
                        System.out.println("继续修改学生信息请输入任意字符,退出请输入0");
                        flag1 = scan.nextLine();
                    }
                    System.out.println("请选择修改功能：1.修改学生信息 2.修改科目信息 3.修改成绩记录 0.退出修改");
                    break;
                case "2":
                    String flag2 = "1";
                    while (!flag2.equals("0")) {
                        subjectUpdate(subjects);//修改课程记录
                        System.out.println("继续修改学生信息请输入任意字符,退出请输入0");
                        flag2 = scan.nextLine();
                    }
                    System.out.println("请选择修改功能：1.修改学生信息 2.修改科目信息 3.修改成绩记录 0.退出修改");
                    break;
                case "3":
                    String flag3 = "1";
                    while (!flag3.equals("0")) {
                        scoreRecordUpdate(students, subjects, scoreRecords);//修改成绩记录
                        System.out.println("继续修改学生成绩请输入任意字符,退出请输入0");
                        flag3 = scan.nextLine();
                    }
                    System.out.println("请选择修改功能：1.修改学生信息 2.修改科目信息 3.修改成绩记录 0.退出修改");
                    break;
                case "0":
                    return;

                default:
                    System.out.println("没有该选项，请确认后再选择：1.修改学生信息 2.修改科目信息 3.修改成绩记录 0.退出修改");
            }
        }

    }

    //3.1修改学生信息
    public static void studentUpdate(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要修改的学号：");
        while (true) {
            String id = scan.nextLine();
            if (id.equals("0")) {//输入0退出
                return;
            }
            int index = getStudentIndex(id, students);
            if (index >= 0) {
                System.out.println("请输入修改后的姓名：");
                String name = scan.nextLine();
                students.get(index).setName(name);
                break;
            } else {
                System.out.println("输入的学号有误，未能找到对应记录，请确认后重新输入：");
            }
        }
    }

    //3.2修改课程信息
    public static void subjectUpdate(ArrayList<Subject> subjects) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要修改的课程号：");
        while (true) {
            String id = scan.nextLine();
            if (id.equals("0")) {//输入0退出
                return;
            }
            int index = getSubjectIndex(id, subjects);
            if (index >= 0) {
                System.out.println("请输入修改后的课程名称：");
                String name = scan.nextLine();
                subjects.get(index).setName(name);
                break;
            } else {
                System.out.println("输入的课程号有误，未能找到对应记录，请确认后重新输入：");
            }
        }

    }

    //3.3修改成绩信息
    public static void scoreRecordUpdate(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        String studentId = "";//学号
        System.out.println("请输入需要修改的学号：");
        while (true) {
            String id = scan.nextLine();
            if (id.equals("0")) {
                return;
            }
            int index = getStudentIndex(id, students);
            if (index >= 0) {
                studentId = id;
                break;
            } else {
                System.out.println("学号输入错误，请确认后重新输入：");
            }
        }

        String testNo = "";
        int srSize = scoreRecords.size();
        System.out.println("请输入考试场次：");
        while (true) {//查询是否有成绩记录
            String no = scan.nextLine();
            if (no.equals("0")) {
                return;
            }
            for (int i = scoreRecords.size() - 1; i >= 0; i--) {
                if (no.equals(scoreRecords.get(i).getNo()) && studentId.equals(scoreRecords.get(i).getStudentId())) {
                    scoreRecords.remove(i);
                }
            }
            if (srSize == scoreRecords.size()) {
                System.out.println("未找到该考试场次下学生成绩记录，请先添加成绩记录或确认后重新输入场次：");
            } else {
                testNo = no;
                break;
            }
        }

        ScoreRecord scoreRecord = new ScoreRecord();
        scoreRecord.setStudentId(studentId);
        scoreRecord.setNo(testNo);
        for (Subject subject : subjects) {//重新添加成绩，达到修改效果
            srId++;
            String subjectName = subject.getName();
            System.out.println("修改后" + studentId + "同学的" + testNo + subjectName + "成绩：");
            while (true) {//获取合法分数输入
                try {
                    double score = scan.nextDouble();
                    if (score >= 0 && score <= 150) {
                        scoreRecord.setScore(score);
                        scoreRecord.setSubjectId(subject.getSubId());
                        scoreRecord.setSrId("" + srId);
                        scoreRecords.add(scoreRecord);
                        break;
                    } else {
                        System.out.println("分数输入错误，请重新输入：");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("分数输入错误，请重新输入：");
                }
            }
        }
        System.out.println("修改成功");

    }

    //4.查询功能
    public static void query(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择查询功能：1.按场次查询考试成绩 2.按照学号查询成绩 3.按照学科查询成绩 0.退出添加");
        while (true) {
            String choose = scan.nextLine();
            switch (choose) {
                case "1":
                    String flag1 = "1";
                    while (!flag1.equals("0")) {
                        queryNo(students, subjects, scoreRecords);//按场次查询考试成绩
                        System.out.println("继续查询考试成绩请输入任意字符,退出请输入0");
                        flag1 = scan.nextLine();
                    }
                    System.out.println("请选择查询功能：1.按场次查询考试成绩 2.按学号查询成绩 3.按学科查询成绩 0.退出添加");
                    break;
                case "2":
                    String flag2 = "1";
                    while (!flag2.equals("0")) {
                        queryStudentId(students, subjects, scoreRecords);//按学号查询考试成绩
                        System.out.println("继续查询考试成绩请输入任意字符,退出请输入0");
                        flag2 = scan.nextLine();
                    }
                    System.out.println("请选择查询功能：1.按场次查询考试成绩 2.按照学号查询成绩 3.按照学科查询成绩 0.退出添加");
                    break;
                case "3":
                    String flag3 = "1";
                    while (!flag3.equals("0")) {
                        querySubjectId(students, subjects, scoreRecords);//按学科查询考试成绩
                        System.out.println("继续查询考试成绩请输入任意字符,退出请输入0");
                        flag3 = scan.nextLine();
                    }
                    System.out.println("请选择查询功能：1.按场次查询考试成绩 2.按照学号查询成绩 3.按照学科查询成绩 0.退出添加");
                    break;
                case "0":
                    return;

                default:
                    System.out.println("没有该选项，请确认后再选择：1.按场次查询考试成绩 2.按照学号查询成绩 3.按照学科查询成绩 0.退出添加");
            }
        }

    }

    //4.1按场次查询成绩
    public static void queryNo(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        String testNo = "";
        System.out.println("请输入考试场次：");
        while (true){//确认考试场次存在
            String no = scan.nextLine();
            if (no.equals("0")){//输入0退出
                return;
            }
            for (ScoreRecord scoreRecord : scoreRecords) {
                if (no.equals(scoreRecord.getNo())) {
                    testNo = no;
                    break;
                }
            }
            if (testNo.equals("")) {
                System.out.println("输入场次错误，请确认后重新输入");
            }else {
                break;
            }
        }

        //按场次展示结果
        System.out.println("学号\t\t姓名\t\t学科\t\t成绩\t\t场次\t\t");
        for (ScoreRecord scoreRecord : scoreRecords) {
            if (testNo.equals(scoreRecord.getNo())) {
                showPerformance(students, subjects, scoreRecord);
            }
        }
    }

    //4.2按学号查询成绩
    public static void queryStudentId(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);

        String studentId = "";
        System.out.println("请输入要查询的学号：");
        while (true){//判断学号是否存在
            String id = scan.nextLine();
            if (id.equals("0")){
                return;
            }
            int index = getStudentIndex(id,students);
            if (index >= 0) {
                for (ScoreRecord scoreRecord : scoreRecords) {
                    if (id.equals(scoreRecord.getStudentId())) {
                        studentId = id;
                        break;
                    }
                }
                if (studentId.equals("")){
                    System.out.println("学号输入错误，请确认后重新输入：");
                }else {
                    break;
                }

            }else {
                System.out.println("学号输入错误，请确认后重新输入：");
            }
        }

        String testNo = "";
        System.out.println("请输入要查询的场次：");
        while (true){//判断场次是否存在
            String no = scan.nextLine();
            if (no.equals("0")){
                return;
            }
            for (ScoreRecord scoreRecord : scoreRecords) {
                if (no.equals(scoreRecord.getNo())) {
                    testNo = no;
                    break;
                }
            }
            if (testNo.equals("")){
                System.out.println("场次输入错误，请确认后重新输入：");
            }else {
                break;
            }
        }
        //展示
        System.out.println("学号\t\t姓名\t\t学科\t\t成绩\t\t场次\t\t");
        for (ScoreRecord scoreRecord : scoreRecords) {
            if (testNo.equals(scoreRecord.getNo()) && studentId.equals(scoreRecord.getStudentId())){
                showPerformance(students,subjects,scoreRecord);
            }
        }
    }

    //4.3按学科查询成绩
    public static void querySubjectId(ArrayList<Student> students, ArrayList<Subject> subjects, ArrayList<ScoreRecord> scoreRecords) {
        Scanner scan = new Scanner(System.in);
        String subjectId = "";
        System.out.println("请输入学科号");
        while (true){
            String id = scan.nextLine();
            if (id.equals("0")){//输入0退出
                return;
            }
            int index = getSubjectIndex(id,subjects);
            if (index >= 0){
                for (ScoreRecord scoreRecord : scoreRecords) {
                if (id.equals(scoreRecord.getSubjectId())) {
                    subjectId = id;
                    break;
                }
            }
                if (subjectId.equals("")){
                    System.out.println("课程号输入错误，请确认后重新输入：");
                }else {
                    break;
                }

            }else {
                System.out.println("学科号输入错误，请确认后重新输入：");
            }
        }

        String testNo = "";
        System.out.println("请输入要查询的场次：");
        while (true){//判断场次是否存在
            String no = scan.nextLine();
            if (no.equals("0")){
                return;
            }
            for (ScoreRecord scoreRecord : scoreRecords) {
                if (no.equals(scoreRecord.getNo())) {
                    testNo = no;
                    break;
                }
            }
            if (testNo.equals("")){
                System.out.println("场次输入错误，请确认后重新输入：");
            }else {
                break;
            }
        }
        //展示
        ArrayList<Double> arr = new ArrayList<Double>();
        System.out.println("学号\t\t姓名\t\t学科\t\t成绩\t\t场次\t\t");
        for (ScoreRecord scoreRecord : scoreRecords) {
            if (testNo.equals(scoreRecord.getNo()) && subjectId.equals(scoreRecord.getSubjectId())){
                arr.add(scoreRecord.getScore());
                showPerformance(students,subjects,scoreRecord);
            }
        }

        System.out.println("平均成绩是"+ avg(arr));
        System.out.println("最大成绩是：" + max(arr) + ",最小成绩是：" + min(arr));

    }


    //根据id查找学生信息索引
    public static int getStudentIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getSid())) {
                return i;
            }
        }
        return -1;
    }

    //根据id查找课程信息索引
    public static int getSubjectIndex(String id, ArrayList<Subject> list) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getSubId())) {
                return i;
            }
        }
        return -1;
    }

    //展示成绩
    public static void showPerformance(ArrayList<Student> students, ArrayList<Subject> subjects,ScoreRecord scoreRecord){
        String studentId = scoreRecord.getStudentId();
        String subjectId = scoreRecord.getSubjectId();
        String studentName = "";
        String subjectName = "";
        String no = scoreRecord.getNo();
        for (Student student : students) {
            if (studentId.equals(student.getSid())) {
                studentName = student.getName();
                break;
            }
        }
        for (Subject subject : subjects) {
            if (subjectId.equals(subject.getSubId())){
                subjectName = subject.getName();
                break;
            }
        }

        System.out.println(studentId +"\t\t"+ studentName +"\t\t"+ subjectName +"\t\t"+ scoreRecord.getScore() +"\t\t"+ no);
    }

    //平均成绩
    public static double avg(ArrayList<Double> arr){
        double sum = 0;
        for (Double aDouble : arr) {
            sum += aDouble;
        }
        return sum / arr.size();
    }
    //最大成绩
    public static double max(ArrayList<Double> arr){
        double max = arr.get(0);
        for (Double aDouble : arr) {
            max = max >= aDouble ? max : aDouble;
        }
        return max;
    }
    //最小成绩
    public static double min(ArrayList<Double> arr){
        double min = arr.get(0);
        for (Double aDouble : arr) {
            min = min <= aDouble ? min : aDouble;
        }
        return min;
    }




}
