package objectexercise;

public class StudentDemo2 {
    private String name;
    private int age;

    public StudentDemo2() {
    }

    public void show(){
        System.out.println(name + " " + age);
    }


}

class StudentDemoTest2{
    public static void main(String[] args) {
        StudentDemo2 s = new StudentDemo2();
        s.show();
    }
}