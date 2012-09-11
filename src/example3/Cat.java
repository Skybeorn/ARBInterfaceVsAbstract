package example3;

/**
 * This is a concrete implementation of the Animal interface contract.
 * @author jlombardo
 */
public class Cat implements Animal {
    private int age;
    private static int lives = 9;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 25; // this works for cat
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    // Notice how this method is implemented differently in Dog
    // No chance of inappropriate or bad code being inherited here.
    public void speak() {
        System.out.println("I'm a cat an I MEOW!");
    }

    // These next two methods are duplicated in Dog
    
    public int getAge() {
        return age;
    }

    public void setAge(int realAge) {
        if(realAge < MIN_AGE || realAge > MAX_AGE) {
            throw new IllegalArgumentException(AGE_ERR_MSG);
        }
    }

    // unique to Cat
    public void sacrificeOneLife() {
        lives--;
    }
}
