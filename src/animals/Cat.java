package animals;

public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    private static int count = 0;

    public Cat() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кіт пробіг " + distance + " м.");
        } else {
            System.out.println("Кіт не може пробігти таку відстань.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кіт не вміє плавати.");
    }
}
