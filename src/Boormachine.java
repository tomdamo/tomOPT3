public class Boormachine extends Product {
    private String merk;
    private String type;

    private static int huurprijsPD = 5;
    private static int verzekeringprijsPD = 1;
    public Boormachine(String merk, String type) {
        super();
        this.merk = merk;
        this.type = type;

    }

    @Override
    public double berekenHuur(int aantalDagen) {
        return 0;
    }

    @Override
    public double berekenVerzekering(int aantalDagen) {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
//prijs is 5 euro per dag, verz. 1 euro per dag.


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
