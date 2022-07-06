package staticandinheritance;

public class ExtendTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setName("lisa");
        teacher1.setAge(28);
        teacher1.setSalary(2000);
        System.out.println(teacher1.getSalary());
        System.out.println(teacher1.getAge());
        System.out.println(teacher1.getName());
        teacher1.teach();

        ClassTeacher teacher2 = new ClassTeacher();
        teacher2.setName("lili");
        teacher2.setAge(30);
        teacher2.setSalary(2000);
        System.out.println(teacher2.getSalary());
        System.out.println(teacher2.getAge());
        System.out.println(teacher2.getName());
        teacher2.admin();

        Student student = new Student();
        student.setName("jhon");
        student.setAge(19);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.say();


        //Teacher teacher3 = new Teacher("lay",28);错误，不能继承父类的构造方法
        Human human = new Human("human",20);
    }
}
