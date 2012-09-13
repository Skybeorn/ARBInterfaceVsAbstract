package example2;

/**
 * Example of an Abstract class. Abstract methods are the contract that all
 * sub-classes must obey. Concrete methods are inherited automatically, along
 * with any properties. What can go wrong with the use of this class?
 *
 * @author Jim Lombardo, WCTC Lead Java Instructor
 */
public abstract class Animal {

    public static final int MIN_AGE = 0;
    private int age;

    public abstract void speak();

    public final int getAge() {
        return age;
    }

    public abstract void setAge(int realAge);
}
