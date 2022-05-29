public class ProductVerzekering {
    private double kortingVerzekering; //Korting na 15, 30 en 50 dagen verzekering. 5% - 10% - 15%
    private boolean bepaalverzekeringsPrijs; //voor het Testontwerp choices
    private boolean isVerzekerd; //of de product is verzekerd

    public double getKortingVerzekering () {
        return kortingVerzekering;
    }

    public void setKortingVerzekering ( double kortingVerzekering){
        this.kortingVerzekering = kortingVerzekering;
    }


    public boolean isBepaalverzekeringsPrijs(boolean isVerhuurd, boolean isVerzekerd, boolean isIngelogd) {
        if (isVerhuurd && isVerzekerd && isIngelogd)
            setBepaalverzekeringsPrijs(true);
        else {
            setBepaalverzekeringsPrijs(false);
        }
        return bepaalverzekeringsPrijs;
    }

    public void setBepaalverzekeringsPrijs(boolean bepaalverzekeringsPrijs) {
        this.bepaalverzekeringsPrijs = bepaalverzekeringsPrijs;
    }

    public void setVerzekerd ( boolean verzekerd){
        isVerzekerd = verzekerd;
    }

}
