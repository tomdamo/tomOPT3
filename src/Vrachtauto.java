public class Vrachtauto extends Product {
    private int id;
    private int laadvermogen;
    private int gewicht;
    //prijs is 0,10 euro per kg laadvermogen
    //verzekering is ook 0,01 euro per kg per dag van de gewicht van de auto

    public Vrachtauto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


