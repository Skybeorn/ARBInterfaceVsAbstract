package example3;

public class Pig implements Animal {

    public void speak() {
        System.out.println("I'm a Pig amd I OINK");
    }

    // What's wrong with these methods?
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setAge(int realAge) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
