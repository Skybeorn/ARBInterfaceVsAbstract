package example4;

/**
 * This is a concrete implementation of the Animal interface contract.
 * @author jlombardo
 */
public class Dog implements Animal {
    private int age;
    
   /** Notice how this method is implemented differently in Dog */
   public void speak() {
        System.out.println("I'm a dog and I BARK!");
    }

    public int getAge() {
        return age;
    }

    // But we still have to worry about inheriting bad code!
    public void setAge(int realAge) {
        if(realAge < 0 || realAge > 15) {
            throw new IllegalArgumentException("Age out of range");
        }
    }

}
