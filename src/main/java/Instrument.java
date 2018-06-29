public class Instrument extends StockItem implements Iplay{
    private String material;
    private String colour;
    private String sound;

    public Instrument(String type, int priceBoughtFor, int priceSoldFor, String material, String colour, String sound){
        super(type, priceBoughtFor, priceSoldFor);
        this.material = material;
        this.colour = colour;
        this.sound = sound;
    }


    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public String play(){
        return this.sound;
    }
}
