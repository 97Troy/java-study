package StudentPerformanceManagementSystem;

public class Student {//学生类
    private String sid;
    private String name;

    public Student() {
    }

    public Student(String sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
