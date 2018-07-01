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

    public void addInstrument(Isell item) {
        this.stock.add(item);
    }

    public void removeInstrument(Isell item) {
        this.stock.remove(item);
    }
}
