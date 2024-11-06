//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog boy = new Dog("Boy","Bulldog", 3);
        System.out.println(boy.getName());
        System.out.println(boy.eat());
        System.out.println(boy.sleep());
        System.out.println(boy.makeSound());

        System.out.println("==========================");

        Cat girl = new Cat("Girl","Persian", 5);
        System.out.println(girl.getName());
        System.out.println(girl.eat());
        System.out.println(girl.sleep());
        System.out.println(girl.makeSound());
    }
}