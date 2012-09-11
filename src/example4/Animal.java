package example4;

/**
 * Example of an Interface. Abstract methods are the contract that all
 * sub-classes must obey.
 * 
 * @author jlombardo
 */
public interface Animal {
    public abstract void speak();

    public abstract int getAge();

    public abstract void setAge(int realAge);
}
