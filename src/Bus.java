import java.util.ArrayList;

public class  Bus extends Car {

    private ArrayList<Person>people=new ArrayList<>();

    public Bus(String name, String color, int maxGuest, int ptice, ArrayList<Person> people) {
        super(name, color, maxGuest, ptice);
        this.people = people;
    }

    public Bus(String name, String color, int maxGuest, int ptice) {
        super(name, color, maxGuest, ptice);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public void stop() {
      if (getMaxGuest()>people.size()){
          System.out.println("орун бар!");
      }else {
          System.out.println("Орун жок!");
      }

    }

    @Override
    public String toString() {
        return "Bus " +"name : "+getName()+" price : "+getPtice()+" color :"+getColor()+"  max guest  "+getMaxGuest()+
                " people : " + people.size()
                ;
    }
}


