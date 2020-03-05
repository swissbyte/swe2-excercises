package ch.juventus.object;

public class Person
{
    private String  firstName;
    private String  lastName;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isHasKids() {
        return hasKids;
    }

    public void setHasKids(boolean hasKids) {
        this.hasKids = hasKids;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", hasKids=" + hasKids +
                '}';
    }

    private boolean hasKids;
}
