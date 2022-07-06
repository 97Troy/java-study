package ObjectExercise;

public class StudentDemo3 {
    private String name;
    private int age;

    public StudentDemo3(){}

    public StudentDemo3(String name){
        this.name = name;
    }

    public StudentDemo3(int age){
        this.age = age;
    }

    public StudentDemo3(int age, String name){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "," + age);
    }


}

class StudentDemoTest3{
    public static void main(String[] args) {
        StudentDemo3 student1 = new StudentDemo3();
        StudentDemo3 student2 = new StudentDemo3(1);
        StudentDemo3 student3 = new StudentDemo3("理想");
        StudentDemo3 student4 = new StudentDemo3(1,"理想");
        student1.show();
        student2.show();
        student3.show();
        student4.show();
    }
}
