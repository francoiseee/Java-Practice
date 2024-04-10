import java.util.*;
public class mainSetter {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        setter x = new setter();
        // x.setName("fons");
        // x.setAge(19);
        // x.setWeight(49);

        System.out.print("Please input your name: "); String name = input.nextLine(); x.setName(name);
        System.out.print("Enter your age: "); int age = input.nextInt(); x.setAge(age);
        System.out.print("My weight is "); double weight = input.nextDouble(); x.setWeight(weight);

        System.out.println("Hi my name is " + x.getName());
        System.out.println("I am " + x.getAge() + " years old");
        System.out.println("My weight is " + x.getWeight());
    }
}
