public class Personenauto extends Product{

    private String merk; //merk van de auto
    private int gewicht; //gewicht in kg
    //prijs is 50 per dag,
    //verzekering is gewicht van de auto, 0,01 euro per kg per dag.


    public Personenauto(String merk, int gewicht) {
        this.merk = merk;
        this.gewicht = gewicht;
    }
}
