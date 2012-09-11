package example4;

/**
 * This is a concrete implementation of the Animal interface contract, plus
 * the Athlete interface contract. Multiple inheritance is only possible with
 * Interfaces.
 * @author jlombardo
 */
public class Cat implements Animal, Athlete {
    private static int lives = 9;
    private int age;

    /** Notice how this method is implemented differently in Dog */
    public void speak() {
        System.out.println("I'm a cat and I MEOW!");
    }

    public int getAge() {
        return age;
    }

    // But we still have to worry about inheriting bad code!
    public void setAge(int realAge) {
        if(realAge < 0 || realAge > 25) {
            throw new IllegalArgumentException("Age out of range");
        }
    }

    public void sacrificeOneLife() {
        lives--;
    }

    public void performLongJump() {
        System.out.println("Cat jumps 5 feet");;
    }
}
