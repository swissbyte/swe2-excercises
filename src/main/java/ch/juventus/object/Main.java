package ch.juventus.object;

public class Main
{


    public static void main(String[] args)
    {
        Person person = new Person();
        Address address = new Address();

        Person a = new Person();
        Person b = new Person();

        a.setLastName("Hans");
        b.setLastName("Hans");

        System.out.println(a.equals(b));

        if(a.equals(b))
        {
            System.out.println("yes");
        }

        System.out.println(a.hashCode());

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
