public class MainDog {
    public static void main(String[]args){
        Dog ginger = new Dog();
        Dog bowser = new Dog();
        Dog roxy = new Dog();

        Inherit_Dog aso = new Inherit_Dog();

        aso.display();
        // ginger.name = "Ginger";
        // ginger.age = 6;
        // ginger.breed = "Akita";
        // ginger.shot = "Up to date";

        // bowser.name = "Bowser";
        // bowser.age = 2;
        // bowser.breed = "Retriever";
        // bowser.shot = "Up to date";

        // roxy.name = "Roxy";
        // roxy.age = 1;
        // roxy.breed = "Beagle";
        // roxy.shot = "Up to date";

        System.out.println("Displaying All Dog Details");
        ginger.display();
        bowser.display();
        roxy.display();

    }
}
