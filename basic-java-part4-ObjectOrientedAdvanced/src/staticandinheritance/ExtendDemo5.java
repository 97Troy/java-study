package staticandinheritance;

public class ExtendDemo5 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
        cat.run();
    }
}

class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("动物可以奔跑");
    }

    public void cry(){
        System.out.println("动物可以叫");
    }
}

class Cat extends Animal{
    private int age;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void cry() {
        System.out.println("猫是喵喵叫");
    }
}

