public class Personenauto extends Product{

    private String merk; //merk van de auto
    private int gewicht; //gewicht in kg
    //prijs is 50 per dag,
    //verzekering is gewicht van de auto, 0,01 euro per kg per dag.
    private static double verzekeringPrijsPD = 0.01;
    private static double totalePrijs = 50; //Prijs incl. of excl. verzekering. Per product is er een andere berekening.

    public Personenauto(String merk, int gewicht) {
        super();
        this.merk = merk;
        this.gewicht = gewicht;

    }

    @Override
    public double berekenHuur(int aantalDagen) {
        return 0;
    }

    @Override
    public double berekenVerzekering(int aantalDagen) {
        double verzekering = verzekeringPrijsPD * gewicht;
        return verzekering * aantalDagen;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, gewicht: %d kg", getId(), merk, gewicht);
    }


    public int getGewicht() {
        return gewicht;
    }

    public String getMerk() {
        return merk;
    }
}
