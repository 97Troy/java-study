package staticandinheritance;

public class ExtendDemo6 {
    public static void main(String[] args) {
        NewStudent student = new NewStudent();
        System.out.println("----------");
        NewStudent student1 = new NewStudent("lili", 28,99.9);
        System.out.println(student1.getScore());
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(){
        System.out.println("父类无参");
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
}

class NewStudent extends Person{
    private double score;

    public NewStudent(){
        //super();//调用父类无参，默认就存在，可以不写，但写必须写在第一行
        System.out.println("子类无参");
    }

    public NewStudent(String name, int age, double score){
        //super();//调用父类无参，默认就存在，可以不写，但写必须写在第一行
        super(name,age);//调用 父类有参，初始化name和age
        this.score = score;
        System.out.println("子类有参");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
