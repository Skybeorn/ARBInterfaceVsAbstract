package example4;

public final class HourlyEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private double baseHourlyRate;
    private double hoursWorkedPerYear = 2080;
    private static final double MIN_RATE = 0;
    private static final double MAX_RATE = 50;
    private static final double MIN_HOURS = 0;
    private static final double MAX_HOURS = 2500;

    public HourlyEmployee(String firstName, String lastName, String ssn, double baseHourlyRate) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setBaseHourlyRate(baseHourlyRate);
    }

    /**
     * Notice that this method is implemented differently than SalariedEmployee
     */
    public double getAnnualWages() {
        return baseHourlyRate * hoursWorkedPerYear;
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
        }

        lastName = value;
    }

    public String getSsn() {
        return ssn;
    }

    public final void setSsn(String value) {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("ssn cannot be null or empty");
        }

        ssn = value;
    }

    public void setHoursWorkedPerYear(double hoursWorkedPerYear) {
        if (hoursWorkedPerYear < MIN_HOURS || hoursWorkedPerYear > MAX_HOURS) {
            throw new IllegalArgumentException("hoursWorkedPerYear must be in range 0 to 2500");
        }
        this.hoursWorkedPerYear = hoursWorkedPerYear;
    }

    public double getHoursWorkedPerYear() {
        return hoursWorkedPerYear;
    }

    public final void setBaseHourlyRate(double baseHourlyRate) {
        if (baseHourlyRate < MIN_RATE || baseHourlyRate > MAX_RATE) {
            throw new IllegalArgumentException("baseHourlyRate must be in range 0 to 50");
        }

        this.baseHourlyRate = baseHourlyRate;
    }

    public double getBaseHourlyRate() {
        return baseHourlyRate;
    }
}
