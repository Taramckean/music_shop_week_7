public abstract class StockItem implements Isell {
    private int priceBoughtFor;
    private int priceSoldFor;
    private String type;

    public StockItem(String type, int priceBoughtFor, int priceSoldFor){
        this.type = type;
        this.priceBoughtFor = priceBoughtFor;
        this.priceSoldFor = priceSoldFor;

    }

    public int getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public int getPriceSoldFor() {
        return priceSoldFor;
    }

    public String getType() {
        return this.type;
    }

    public int calculateMarkup(){
        return this.priceSoldFor -= this.priceBoughtFor;
    }

}
