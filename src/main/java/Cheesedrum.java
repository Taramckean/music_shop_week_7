public class Cheesedrum extends Instrument {
    private int solidityLevel;

    public  Cheesedrum(
    String type, int priceBoughtFor, int priceSoldFor, String material, String colour, String sound)

    {  super(type, priceBoughtFor, priceSoldFor, material, colour, sound);
        this.solidityLevel = 8;
    }


    public int getSolidity() {
        return this.solidityLevel;
    }

    public void bashHard(){
        if (this.solidityLevel >= 1)
        this.solidityLevel -= 1;
    }
}