public class Boormachine extends Product {
    private int id;
    private String merk;
    private String type;

    @Override
    void selectProductType() {

    }

    @Override
    void createPrice() {

    }

    @Override
    void createVerzekering() {

    }

    public Boormachine() {

    }
//prijs is 5 euro per dag, verz. 1 euro per dag.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
