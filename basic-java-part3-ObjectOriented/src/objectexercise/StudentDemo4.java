package objectexercise;

public class StudentDemo4 {
    private String name;
    private int age;

    public StudentDemo4(){ }

    public StudentDemo4(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name + "," + age);
    }
}


class StudentDemoTest4{
    public static void main(String[] args) {
        StudentDemo4 student1 = new StudentDemo4();
        StudentDemo4 student2 = new StudentDemo4();
        student1.setAge(18);
        student1.setName("林青霞");
        student1.show();
        student2 = new StudentDemo4("林青霞",19);
        student2.show();
    }
}