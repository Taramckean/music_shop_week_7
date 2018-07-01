import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Isell> stock;

    public Shop(String name){
        this.name = name;
        stock = new ArrayList<Isell>();
    }

    public String getName() {
        return this.name;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addItem(Isell item) {
        this.stock.add(item);
    }

    public void removeItem(Isell item) {
        this.stock.remove(item);
    }

    public int calculateTotalMarkup() {
        int totalMarkup =0;
        for (Isell item : stock)
        {totalMarkup += item.calculateMarkup() ;}
        return totalMarkup;
    }
}
