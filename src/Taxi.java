import java.util.AbstractList;
import java.util.ArrayList;

public class Taxi extends Car {

    private AbstractList<Person> client = new ArrayList<>();

    public Taxi(String name, String color, int maxGuest, int ptice, AbstractList<Person> client) {
        super(name, color, maxGuest, ptice);
        this.client = client;
    }

    public Taxi(String name, String color, int maxGuest, int ptice) {
        super(name, color, maxGuest, ptice);
    }

    public AbstractList<Person> getClient() {
        return client;
    }

    public void setClient(AbstractList<Person> client) {
        this.client = client;
    }
    @Override
    public void stop() {
        if (getMaxGuest()>client.size()){
            System.out.println("орун бар!");
        }else {
            System.out.println("Орун жок!");
        }

    }
    @Override
    public String toString() {
        return "Bus{" +"name : "+getName()+" price : "+getPtice()+" color :"+getColor()+"  max guest  "+getMaxGuest()+
                "  people : " + client.size()
                ;
    }
}

