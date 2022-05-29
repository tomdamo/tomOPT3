public class Personenauto extends Product{

    private int id; //
    private String merk; //merk van de auto
    private int gewicht; //gewicht in kg
    //prijs is 50 per dag,
    //verzekering is gewicht van de auto, 0,01 euro per kg per dag.
    private double verzekeringPrijs;
    private double totalePrijs; //Prijs incl. of excl. verzekering. Per product is er een andere berekening.

    public Personenauto(int id, String merk, int gewicht) {
        this.id = id;
        this.merk = merk;
        this.gewicht = gewicht;
    }


    public String getMerk() {
        return merk;
    }
}
