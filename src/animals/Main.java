package animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Кількість створених собак : " + Dog.getCount());
        System.out.println("Кількість створених котів : " + Cat.getCount());

        dog.run(150);
        dog.swim(5);

        cat.run(250);
        cat.swim(5);
    }
}