public class HurdyGurdy extends Instrument {
    private int key;

    public HurdyGurdy(String type, int priceBoughtFor,
                      int priceSoldFor, String material, String colour, String sound){
        super(type, priceBoughtFor, priceSoldFor, material, colour, sound);
        this.key = 1;
    }

    public void changeKey(){
        if (this.key < 5)
        this.key += 1;
    }


    public int checkKey() {
        return this.key;
    }
}
