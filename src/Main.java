import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));
        people.add(new Person("Murat", 21));

        ArrayList<Person> client = new ArrayList<>();
        client.add(new Person("Murat", 21));
        client.add(new Person("Murat", 21));
        client.add(new Person("Murat", 21));
        client.add(new Person("Murat", 21));
        client.add(new Person("Murat", 21));


        Bus bus = new Bus("Sprinter", "white", 20, 10000, people);
        Taxi taxi = new Taxi("Odysey", "black", 4, 6000, client);

        StopableInpl stopableInpl = new StopableInpl();
        //  stopableInpl.getAll(bus, taxi);
        //  stopableInpl.searchWithName(bus, taxi);
       bus.stop();
       // taxi.stop();


    }
}