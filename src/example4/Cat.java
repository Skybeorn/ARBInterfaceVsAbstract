package example4;

public final class Cat implements Animal, Athlete {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 25;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;
    private static int lives = 9;
    private int age;

    public Cat(int age) {
        setAge(age);
    }

    public void speak() {
        System.out.println("I'm a cat and I MEOW!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int realAge) {
        if (realAge < MIN_AGE || realAge > MAX_AGE) {
            throw new IllegalArgumentException(AGE_ERR_MSG);
        }
    }

    public void sacrificeOneLife() {
        lives--;
    }

    public void performLongJump() {
        System.out.println("Cat jumps 5 feet");;
    }
}
