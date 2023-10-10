package animals;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    private static int count = 0;

    public Dog() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака пробігла " + distance + " м.");
        } else {
            System.out.println("Собака не може пробігти таку відстань.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака пропливла " + distance + " м.");
        } else {
            System.out.println("Собака не може пропливти таку відстань.");
        }
    }
}