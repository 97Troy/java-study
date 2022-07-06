package staticandinheritance;

public class ClassTeacher extends Human{
    private double salary;
    public void admin(){
        System.out.println("管理");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
