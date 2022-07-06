package ObjectExercise;


public class Student {
    String name;
    int age;

    public void study(){
        System.out.println("学习");
    }

    public void doHomework(){
        System.out.println("做作业");
    }

}

class StudentDemo{
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 19;
        s.name = "小明";
        System.out.println(s.age);
        System.out.println(s.name);

        s.study();
        s.doHomework();

    }
}
