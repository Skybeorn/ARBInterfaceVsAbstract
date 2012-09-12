package example3;

public final class Cat implements Animal {
    private int age;
    private static int lives = 9;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 25; // this works for cat
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;


    public Cat(int realAge){
     setAge(realAge);          
    }
    
    public void speak() {
        System.out.println("I'm a cat an I MEOW!");
    }
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int realAge) {
        if(realAge < MIN_AGE || realAge > MAX_AGE) {
            throw new IllegalArgumentException(AGE_ERR_MSG);
        }
    }

    public void sacrificeOneLife() {
        lives--;
    }
}
