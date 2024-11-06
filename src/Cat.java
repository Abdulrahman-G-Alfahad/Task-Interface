public class Cat implements Animal{
    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String eat() {
        return "Chomp! Chomp! Chomp!";
    }

    @Override
    public String sleep() {
        return "ZZZZZZzzzzzz.......";
    }

    @Override
    public String makeSound() {
        return "meow Meow MEOW!!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
