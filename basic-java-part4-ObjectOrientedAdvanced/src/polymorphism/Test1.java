package polymorphism;


import staticandinheritance.ExtendDemo2;
import staticandinheritance.Student;

public class Test1 {
    public static void main(String[] args) {
        PersonFeeding person1 = new PersonFeeding("老王",30);
        PersonFeeding person2 = new PersonFeeding("老李",25);
        Cats cat = new Cats();
        cat.setColor("灰颜色");
        cat.setAge(3);
        Dogs dog = new Dogs();
        dog.setColor("黑颜色");
        dog.setAge(2);
        person1.keepPet(dog,"骨头");
        person1.keepPet(cat,"鱼");

    }
}

class Animals{
    private int age;
    private String color;

    public Animals() {
    }

    public Animals(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something){

    }
}

class Cats extends Animals{
    @Override
    public void eat(String something) {
        System.out.println("猫咪侧躺着吃" + something);
    }

    public void catchMouse(){
        System.out.println("猫咪抓老鼠");
    }
}

class Dogs extends Animals{
    @Override
    public void eat(String something) {
        System.out.println("狗子用腿按住" + something + "吃");
    }

    public void lookHone(){
        System.out.println("狗子看家");
    }
}

class PersonFeeding{
    private String name;
    private int age;

    public PersonFeeding() {
    }

    public PersonFeeding(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Animals animals, String something){
        if (animals instanceof Dogs){
            Dogs d = (Dogs)animals;
            System.out.println("年龄为" + age + "的" + name + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的狗");
            System.out.print(d.getAge() + "岁的" + d.getColor() + "的狗");
            d.eat(something);
        }else if (animals instanceof Cats){
            Cats c = (Cats)animals;
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getColor() + "的" + c.getAge() + "岁的狗");
            System.out.print(c.getAge() + "岁的" + c.getColor() + "的狗");
            c.eat(something);
        }
    }
}