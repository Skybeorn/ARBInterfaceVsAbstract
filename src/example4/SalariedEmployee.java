package example4;

public final class SalariedEmployee implements Employee, Athlete {

    private String firstName;
    private String lastName;
    private String ssn;
    private double annualSalary;
    private double annualBonus;
    private static final double MIN_SALARY = 0;
    private static final double MAX_SALARY = 500000;
    private static final double MIN_BONUS = 0;
    private static final double MAX_BONUS = 100000;

    public SalariedEmployee(String firstName, String lastName, String ssn, double annualSalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setAnnualSalary(annualSalary);
    }

    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("first name cannot be null or empty");
        };

        firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("last name cannot be null or empty");
        };

        lastName = value;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String value) {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("ssn cannot be null or empty");
        };

        ssn = value;
    }
    
    // These methods are specfic to A Salaried Employee. Our own inplementations
    //allow us to do this.
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < MIN_SALARY || annualSalary > MAX_SALARY) {
            throw new IllegalArgumentException("annualSalary must be in range 0 to 500,000");
        };

        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if (annualBonus < MIN_BONUS || annualBonus > MAX_BONUS) {
            throw new IllegalArgumentException("annualBonus must be in range 0 to 100,000");
        };

        this.annualBonus = annualBonus;
    }

    public void performLongJump() {
        System.out.println("SalariedEmployee jumps 15 feet");
    }
}
