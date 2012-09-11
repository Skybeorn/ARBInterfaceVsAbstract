package example3;

/**
 * This is a concrete implementation of the Animal interface contract.
 * @author jlombardo
 */
public class Dog implements Animal {
    private int age;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 15; // now we have a good choice for dog
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;
    
    // Notice how this method is implemented differently in Cat
    // No chance of inappropriate or bad code being inherited here.
   public void speak() {
        System.out.println("I'm a dog and I BARK!");
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
}
