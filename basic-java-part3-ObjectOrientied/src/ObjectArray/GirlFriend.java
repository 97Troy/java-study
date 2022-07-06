package ObjectArray;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String habit;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gender, String habit) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habit = habit;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public void showInfo(){
        System.out.println(name + " " + age + " " + gender + " " + habit);

    }
}
