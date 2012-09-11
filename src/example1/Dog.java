package example1;

/**
 * This is a concrete implementation of the Animal concrete (normal) class.
 * Anything missing here?
 *
 * @author Jim Lombardo, WCTC Lead Java Instructor
 */
public class Dog extends Animal {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 15;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    @Override
    public void speak() {
        System.out.println("Hi, I'm a dog and therefore I BARK!");
    }

    @Override
    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            System.out.println(AGE_ERR_MSG);
        }
    }
}
