public class Vrachtauto extends Product {
    private int laadvermogen;
    private int gewicht;
    //prijs is 0,10 euro per kg laadvermogen
    //verzekering is ook 0,01 euro per kg per dag van de gewicht van de auto

    public Vrachtauto(int laadvermogen, int gewicht) {
        super();
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;

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

    public int getLaadvermogen() {
        return laadvermogen;
    }

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}


