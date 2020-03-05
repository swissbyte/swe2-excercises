package ch.juventus.object;

public class Main
{


    public static void main(String[] args)
    {
        Person person = new Person();
        Address address = new Address();

        address.setStreet("Lindenweg");
        address.setNumber(6);
        address.setZip(6345);
        address.setCity("Neuheim");

        person.setAddress(address);
        person.setFirstName("Clive");
        person.setLastName("Driver");
        person.setHasKids(true);

        System.out.println(person);


    }

}
