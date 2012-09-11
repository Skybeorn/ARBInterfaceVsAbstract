package example2;

/**
 * This is a concrete implementation of the Animal abstract class. Notice that
 * some methods are automatically inherited and others require declaration and
 * implementation. <p> Also, you can only extend ONE super class. So what
 * happens if you need to extend another? Screwed!
 *
 * @author Jim Lombardo, WCTC Lead Java Instructor
 */
public final class Dog extends Animal {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 25;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    public void speak() {
        System.out.println("Hi, I'm a dog and I BARK!");
    }

    public Dog(int age){
        setAge(age);
        
    }
    @Override
    public void setAge(int realAge) {
        if (realAge < MIN_AGE || realAge > MAX_AGE) {
            System.out.println(AGE_ERR_MSG);
        }
    }
}
