package example2;

public final class Cat extends Animal {
    

    private static final int MAX_AGE = 25;
    private static final String AGE_ERR_MSG = "realAge must be a value between "
            + MIN_AGE + " and " + MAX_AGE;

    public Cat(int age){
        setAge(age);
    }
    public final void speak() {  
        ConsoleOutput out = new ConsoleOutput();
        out.outputMessage("Meow");
    }

    @Override
    public final void setAge(int realAge) {
        if( realAge < Animal.MIN_AGE|| realAge > Cat.MAX_AGE){
            System.out.println(AGE_ERR_MSG);
        }
    }
}
