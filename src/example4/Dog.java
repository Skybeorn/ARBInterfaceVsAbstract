package example4;

/**
 * This is a concrete implementation of the Animal interface contract.
 *
 * @author jlombardo
 */
public final class Dog implements Animal {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 15;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;
    private int age;

    public Dog(int age) {
        setAge(age);
    }

    public void speak() {
        System.out.println("I'm a dog and I BARK!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int realAge) {
        if (realAge < MIN_AGE || realAge > MAX_AGE) {
            throw new IllegalArgumentException(AGE_ERR_MSG);
        }
    }
}
