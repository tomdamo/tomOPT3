public class Personenauto extends Product{

    private int id; //
    private String merk; //merk van de auto
    private int gewicht; //gewicht in kg
    //prijs is 50 per dag,
    //verzekering is gewicht van de auto, 0,01 euro per kg per dag.
    private double verzekeringPrijs;
    private double totalePrijs; //Prijs incl. of excl. verzekering. Per product is er een andere berekening.

    @Override
    void selectProductType() {

    }

    @Override
    void createPrice() {

    }

    @Override
    void createVerzekering() {

    }

    public Personenauto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public double getVerzekeringPrijs() {
        return verzekeringPrijs;
    }

    public void setVerzekeringPrijs(double verzekeringPrijs) {
        this.verzekeringPrijs = verzekeringPrijs;
    }

    public double getTotalePrijs() {
        return totalePrijs;
    }

    public void setTotalePrijs(double totalePrijs) {
        this.totalePrijs = totalePrijs;
    }

    public String getMerk() {
        return merk;
    }
}
