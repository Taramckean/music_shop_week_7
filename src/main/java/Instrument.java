public class Instrument extends StockItem{
    private String name;
    private String material;
    private String colour;

    public Instrument(String name, String type, int priceBoughtFor, int priceSoldFor, String material, String colour){
        super(type, priceBoughtFor, priceSoldFor);
        this.name = name;
        this.material = material;
        this.colour = colour;
    }


    public String getName() {
        return this.name;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }
}
