package example4;

/**
 * This interface defines the contract for all subclasses.
 * @author jlombardo
 */
public interface Employee {
    public abstract double getAnnualWages();

    public abstract String getFirstName();

    public abstract void setFirstName(String value);

    public abstract String getLastName();

    public abstract void setLastName(String value);

    public abstract String getSsn();

    public abstract void setSsn(String value);
}
