import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car  {
    private String name;
    private String color;
    private int maxGuest;
    private int ptice;

    public Car(String name, String color, int maxGuest, int ptice) {
        this.name = name;
        this.color = color;
        this.maxGuest = maxGuest;
        this.ptice = ptice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public int getPtice() {
        return ptice;
    }

    public void setPtice(int ptice) {
        this.ptice = ptice;
    }
    public void stop(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxGuest=" + maxGuest +
                ", ptice=" + ptice +
                '}';
    }
}
