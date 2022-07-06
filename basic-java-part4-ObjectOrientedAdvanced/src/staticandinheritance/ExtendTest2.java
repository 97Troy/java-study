package staticandinheritance;

public class ExtendTest2 {
    public static void main(String[] args) {
        NewCat newCat = new NewCat("大黄", 2, "白色");
        Dog dog = new Dog("大黄", 2, "黑色", "汪汪");
        System.out.println(newCat.getName() + newCat.getAge() + newCat.getColor());
        System.out.println(dog.getName() + dog.getAge() + dog.getColor() + dog.getCry());

    }

}

class NewAnimal {
    private String name;
    private int age;
    private String color;

    public NewAnimal() {
    }

    public NewAnimal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class NewCat extends NewAnimal {
    public NewCat() {
    }

    public NewCat(String name, int age, String color) {
        super(name, age, color);
    }
}

class Dog extends NewAnimal {
    private String cry;

    public Dog() {
    }

    public Dog(String name, int age, String color, String cry) {
        super(name, age, color);
        this.cry = cry;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }
}