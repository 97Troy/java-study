package staticandinheritance;
//子类 Teacher类
public class Teacher extends Human{
    private double salary;
    public void teach(){
        System.out.println("教学");
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
