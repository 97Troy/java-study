package StudentPerformanceManagementSystem;

public class Subject {//科目类
    private String subId;
    private String name;

    public Subject() {
    }

    public Subject(String subId, String name) {
        this.subId = subId;
        this.name = name;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
