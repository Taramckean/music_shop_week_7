public class Flugelhorn extends Instrument {

    public Flugelhorn(String type, int priceBoughtFor,
                      int priceSoldFor, String material, String colour, String sound) {
        super(type, priceBoughtFor, priceSoldFor, material, colour, sound);

    }


    public String pushValveDown() {
        return "HOOOOOOOT";
    }
}
