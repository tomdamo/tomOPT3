public class Vrachtauto extends Product{
    private int id;
    private int laadvermogen;
    private int gewicht;
    //prijs is 0,10 euro per kg laadvermogen
    //verzekering is ook 0,01 euro per kg per dag van de gewicht van de auto

    public Vrachtauto(int id, int laadvermogen, int gewicht) {
        this.id = id;
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
    }

    public int getId() {
        return id;
    }
}
