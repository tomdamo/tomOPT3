public class Vliegtuig {
    //voor de pairwise testing
    private boolean nlVliegtuig;
    private boolean bagage;
    private int gewicht;
    private int passagiers;

    public Vliegtuig(int gewicht, int passagiers, boolean bagage, boolean nlVliegtuig) {
        this.nlVliegtuig = nlVliegtuig;
        this.bagage = bagage;
        this.gewicht = gewicht;
        this.passagiers = passagiers;
    }

    double berekenLanding(Vliegtuig vl){
        double kosten = 0;
        double metBagage = 0;
        double metBtw = 0;
        double passKosten = 0;

        int bagagekosten = 800;
        double btw = 1.21;

        if (gewicht < 1000){
            kosten = 100;
        }
        if ((gewicht >= 1000) && (gewicht <5000)){
            kosten = 500;
        }
        if (gewicht > 5000){
            kosten = 2500;
        }
        if (passagiers >= 2){
             passKosten = kosten * 1.5;
        }
        if (passagiers < 2){
            passKosten = 0;
        }
        if (bagage = true){
            metBagage = bagagekosten + kosten;
        }
        if (bagage = false){
            metBagage = 0;
        }
        if (nlVliegtuig = true){
             metBtw = btw * kosten;
        }
        if (bagage = false){
            metBagage = 0;
        }
        return kosten + passKosten + metBagage + metBtw;
    }
}
