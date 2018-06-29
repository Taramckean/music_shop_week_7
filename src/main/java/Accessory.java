public class Accessory extends StockItem{
    private String type;

    public Accessory(String type, int priceBoughtFor, int priceSoldFor){
        super(priceBoughtFor, priceSoldFor);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
