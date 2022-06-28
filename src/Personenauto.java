public class Personenauto extends Product{

    private String merk; //merk van de auto
    private int gewicht; //gewicht in kg
    //prijs is 50 per dag,
    //verzekering is gewicht van de auto, 0,01 euro per kg per dag.
    private static double verzekeringPrijsPD = 0.01;
    private static double huurPrijs = 50;

    public Personenauto(String merk, int gewicht) {
        super();
        this.merk = merk;
        this.gewicht = gewicht;

    }

    @Override
    public double berekenHuur(int aantalDagen) {
        return huurPrijs * aantalDagen;
    }

    @Override
    public double berekenVerzekering(int aantalDagen) {
        double verzekering = verzekeringPrijsPD * gewicht;
        return verzekering * aantalDagen;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, gewicht: %d kg, %s", getId(), merk, gewicht, getVerhuurd());
    }


    public int getGewicht() {
        return gewicht;
    }

    public String getMerk() {
        return merk;
    }
}
