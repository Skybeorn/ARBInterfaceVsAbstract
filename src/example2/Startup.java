package example2;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments not used
     */
    public static void main(String[] args) {
        
        // Create an array of animals so we can process them as a group
        Animal[] animals = { new Dog(9), new Cat(7) };
        
        // Polymorphism -- This only works for common behaviors (methods)!
        for(Animal a : animals) {
            a.speak();
            System.out.println(a.getAge());
            
        }


        // To use a non-common method you must add this cast to the loop:
//        ((Cat)a).sacrificeOneLife();
        // .. but that would destroy the flexibility of the loop
    }

}
