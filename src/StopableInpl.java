import java.util.Scanner;

public class StopableInpl implements Stopable {

    public StopableInpl() {

    }


    @Override
    public void searchWithName(Bus bus, Taxi taxi) {
        System.out.println("write a name car :");
        String name=new Scanner(System.in).nextLine();
        Car[]cars={bus,taxi};
        for (Car c:cars
             ) {if(c.getName().equals(name)){
            System.out.println(c.toString());
        }

        }


    }

    @Override
    public void searchWithBus(Taxi taxi) {

    }

    @Override
    public void getAll(Bus bus, Taxi taxi) {

        Car[]cars={bus,taxi};
        for (Car c:cars
             ) {
            System.out.println(c);
        }

    }
   
}
