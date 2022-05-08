public class Product {
    private int id; //om de product te onderscheiden
    private double huurPrijs; //prijs van de product per dag
    private boolean isVerzekerd; //of de product is verzekerd

    private int dagenVerzekerd; // aantal dagen dat de product is verzekerd


    private double kortingVerzekering; // korting na 15, 30 en 50 dagen verzekering. 5% - 10% - 15%
    private double totalePrijs; //prijs incl of excl verzkering. Per product is er een andere berekening.
    private boolean isVerhuurd; //of de productbeschikbaar is of niet

    public Product() {
        this.id = id;
        this.huurPrijs = huurPrijs;
        this.isVerzekerd = isVerzekerd;
        this.dagenVerzekerd = dagenVerzekerd;
        this.kortingVerzekering = kortingVerzekering;
        this.totalePrijs = totalePrijs;
        this.isVerhuurd = isVerhuurd;
    }
    public void voegProductToe(){

    }
    public void berekenKorting(){

        if ((0 <= getDagenVerzekerd()) && (getDagenVerzekerd() < 15)){
            setKortingVerzekering(1.00); //geen korting
        }
        else if ((getDagenVerzekerd() >= 15) && (getDagenVerzekerd() < 30)){
            setKortingVerzekering(0.95); //5% korting
        }
        else if (getDagenVerzekerd() >= 30){
            setKortingVerzekering(0.90); //10% korting. verzekering prijs * dit
        }
    }

    public void setHuurPrijs(){

    }
    public double berekenTotaleprijs(){
        return totalePrijs;
    }

    public boolean isVerhuurd() {
        return isVerhuurd;
    }

    public boolean isVerzekerd() {
        return isVerzekerd;
    }
    public int getDagenVerzekerd() {
        return dagenVerzekerd;
    }

    public void setDagenVerzekerd(int dagenVerzekerd) {
        this.dagenVerzekerd = dagenVerzekerd;
    }
    public double getKortingVerzekering() {
        return kortingVerzekering;
    }

    public void setKortingVerzekering(double kortingVerzekering) {
        this.kortingVerzekering = kortingVerzekering;
    }
}
