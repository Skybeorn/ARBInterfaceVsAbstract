package example4;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments not used
     */
    public static void main(String[] args) {
        
        // Process animals as a group
        Animal[] animals = { new Dog(), new Cat() };
        
        // Polymorphism -- This only works for common behaviors (methods)!
        System.out.println("Behaving like animals...");
        for(Animal a : animals) {
            a.speak();
        }

        // Create some employees and process them as a group
        Employee employee1 = new SalariedEmployee("John", "Doe", "333-33-3333", 35000);
        Employee employee2 = new HourlyEmployee("Sally", "Smith", "444-44-4444", 14.50);
        Employee[] employees = {employee1, employee2};

        // Polymorphism -- This only works for common behaviors (methods)!
        System.out.println("\nBehaving like employees...");
        for(Employee e : employees) {
            String name = e.getFirstName() + " " + e.getLastName();
            double wages = e.getAnnualWages();
            System.out.println(name + " is paid " + wages + " per year");
        }

        // Now process Athletes as a group (cross class hierarchies)
        Athlete[] athletes = { new Cat(), (Athlete)employee1 };
        System.out.println("\nBehaving like athletes...");
        for(Athlete athlete : athletes) {
            athlete.performLongJump();
        }
    }

}
