package example1;

public class Startup {

    public static void main(String[] args) {
        
          // Create an array of animals so we can process them as a group
        Animal[] animals = { new Dog(), new Cat(), new Pig(), new Elephant() };
        
        // Notice how flexible and none rigid this is! What do we call this?
        // You can change or add new animals without breaking code
        // But speak may not do what you expect. Why?
        for(Animal a : animals) {
            a.speak();
        } // end for
    } // end main

} // end class
