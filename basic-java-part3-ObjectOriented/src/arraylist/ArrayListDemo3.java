package arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangyang", 18);
        Student s2 = new Student("zhangsan", 22);
        Student s3 = new Student("heizhe", 28);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
