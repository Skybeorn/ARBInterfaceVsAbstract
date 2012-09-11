package example1;

/**
 * Example of a concrete (normal) class. All methods must be fully
 * implemented and are inherited automatically and invisibly, along
 * with any properties.
 * 
 * @author  Jim Lombardo, WCTC Lead Java Instructor
 */
public abstract class Animal {
    private int age;

    public abstract void speak();

    public int getAge() {
        return age;
    }
    public abstract void setAge(int age);
}
