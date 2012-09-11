package example2;

public final class Cat extends Animal {
    
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 25;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    public Cat(int age){
        setAge(age);
    }
    public void speak() {
        System.out.println("Hi, I'm a cat an I MEOW!");
    }

    @Override
    public void setAge(int realAge) {
        if( realAge < MIN_AGE || realAge > MAX_AGE){
            System.out.println(AGE_ERR_MSG);
        }
    }
}
