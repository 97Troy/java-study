package polymorphism;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show (){
        System.out.println(name + "," + age);
    }
}

class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + "," + getAge());
    }
}

class Student extends Person{
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void performance(){
        System.out.println("成绩优秀");
    }

    @Override
    public void show() {
        System.out.println("学生的信息为：：" + getName() + "," + getAge());
    }
}

class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息为：：" + getName() + "," + getAge());
    }

}

