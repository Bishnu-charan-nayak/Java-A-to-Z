package Encapulations;
class TV {

    private int volume;
    private int brightness;

    // Parameterized constructor
    public TV(int volume, int brightness) {
        System.out.println("inside param constructor");
        this.volume = volume;
        this.brightness = brightness;
    }

    // No-argument constructor (constructor chaining)
    public TV() {
        this(50, 60);
        System.out.println("inside zero param constr");
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }
}

public class Home3 {

    public static void main(String[] args) {

        TV tv = new TV();
        System.out.println(tv.getBrightness());
        System.out.println(tv.getVolume());

    }
}
