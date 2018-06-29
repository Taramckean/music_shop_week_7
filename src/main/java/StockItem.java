public abstract class StockItem {
    private int priceBoughtFor;
    private int priceSoldFor;

    public StockItem(int priceBoughtFor, int priceSoldFor){
        this.priceBoughtFor = priceBoughtFor;
        this.priceSoldFor = priceSoldFor;
    }

    public int getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public int getPriceSoldFor() {
        return priceSoldFor;
    }
}
