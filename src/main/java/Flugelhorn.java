public class Flugelhorn extends Instrument {
    private int valves;
    public Flugelhorn(String type, int priceBoughtFor,
                      int priceSoldFor, String material, String colour, String sound, int valves) {
        super(type, priceBoughtFor, priceSoldFor, material, colour, sound);
        this.valves = 5;
    }


    public int countValves() {
        return this.valves;
    }
}
