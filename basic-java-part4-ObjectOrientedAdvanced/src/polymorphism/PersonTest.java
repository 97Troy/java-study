package polymorphism;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        Person p = new Student();
        //Student s1 = (Teacher)p;转换异常
        Student s1 = (Student) p;
        s1.performance();
        s1.show();

        System.out.println(p instanceof Student);//instanceof


        Teacher t= new Teacher();
        t.setName("李四");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(30);

        register(s);
        register(t);
        register(admin);
    }

    public static void register(Person p){
        p.show();
    }
}
