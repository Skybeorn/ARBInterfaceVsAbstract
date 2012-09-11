package example2;

/**
 * Example of an Abstract class. Abstract methods are the contract that all
 * sub-classes must obey. Concrete methods are inherited automatically, along
 * with any properties. What can go wrong with the use of this class?
 * 
 * @author Jim Lombardo, WCTC Lead Java Instructor
 */
public abstract class Animal {
    private int age;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 25;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    public abstract void speak();

    // Since an abstract class is a hybrid, it can have BOTH abstract
    // methods as seen above, AND concrete methods as seen below:
    
    public int getAge() {
        return age;
    }

    // But we still have to worry about inheriting bad code!
    public void setAge(int realAge) {
        if(realAge < 0 || realAge > 25) {
            throw new IllegalArgumentException(AGE_ERR_MSG);
        }
    }
}
