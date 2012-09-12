package example3;

public final class Pig implements Animal {

    private int age;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 15; // now we have a good choice for dog
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    public Pig(int realAge) {
        setAge(realAge);
    }

    public void speak() {
        System.out.println("I'm a Pig amd I OINK");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int realAge) {
        if (realAge < MIN_AGE || realAge > MAX_AGE) {
            throw new IllegalArgumentException(AGE_ERR_MSG);
        }
    }
}
