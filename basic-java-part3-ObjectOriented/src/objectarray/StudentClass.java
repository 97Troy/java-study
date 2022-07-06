package objectarray;

public class StudentClass {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student stu1 = new Student("1", "zhangsan", 23);
        Student stu2 = new Student("2", " lisi", 24);
        students[0] = stu1;
        students[1] = stu2;

        Student stu4 = new Student("4", "zhaoliu", 26);

        boolean flag = contains(stu4, students);
        if (flag) {
            System.out.println("当前id已经重复，请修改id后在做添加");
        } else {
            int count = getCount(students);
            if (count < students.length) {
                students[count] = stu4;
                printArray(students);
            } else {
                students = newArray(stu4, students);
                printArray(students);
            }
        }

        int index = getIndex(students,"4");
        if (index != -1){
            students[index] = null;
            printArray(students);
        }

    }

    public static boolean contains(Student student1, Student[] students) {
        for (Student student : students) {
            if (student != null) {
                if (student1.getId() == student.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] newArray(Student student, Student[] students) {
        Student[] newArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }
        newArray[students.length] = student;
        return newArray;
    }

    public static void printArray(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                System.out.println(students[i].getId() + ", " + students[i].getName() + ", " + students[i].getAge());
            }
        }
    }

    public static int getIndex(Student[] students, String id){
        for (int i =0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }

}
