package example2;

/**
 * This is a concrete implementation of the Animal abstract class. Notice
 * that some methods are automatically inherited and others require
 * declaration and implementation.
 * <p>
 * Also, you can only extend ONE super class. So what happens if you need
 * to extend another? Screwed!
 * 
 * @author Jim Lombardo, WCTC Lead Java Instructor
 */
public class Dog extends Animal {

    // Notice we must declare this method here because it is abstract in
    // the super class. And now we can provide our own reliable implementation.
    public void speak() {
        System.out.println("Hi, I'm a dog and I BARK!");
    }

    
}
