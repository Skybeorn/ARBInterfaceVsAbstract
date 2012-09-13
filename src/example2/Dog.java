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

    private static final int MAX_AGE = 25;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    public final void speak() {
        ConsoleOutput out = new ConsoleOutput();
        out.outputMessage("Bark");
    }

    public Dog(int age){
        setAge(age);
        
    }
    @Override
    public final void setAge(int realAge) {
        if (realAge < Animal.MIN_AGE || realAge > Dog.MAX_AGE) {
            System.out.println(AGE_ERR_MSG);
        }
        age = realAge;
    }
}
