package example3;

/**
 * In this example we switch to a pure abstraction for our super class.
 * This has the benefit of solving all of the inheritance dangers because 
 * there is no implementation code to inherit!
 * <p>
 * An interface specifies common methods that MUST be implemented in concrete
 * sub-classes. In that sense, we say that the interface is a general
 * contract for all sub types. Basing classes on Interfaces is a design
 * strategy called "design by contract," and is a best practice.
 * <p>
 * Notice, however, that we have to move the age property and its getters/setters
 * to the sub classes because normal properties are not allowed in an Interface;
 * only public static final properties (constants) are allowed.
 * 
 * @author Jim Lombardo, WCTC Lead Java Instructor
 */
public interface Animal {
    public abstract void speak();

    public abstract int getAge();

    public abstract void setAge(int realAge);
}
