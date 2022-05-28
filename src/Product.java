import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private boolean isVerzekerd; //of de product is verzekerd

    private int dagenVerzekerd; // Aantal dagen dat het product is verzekerd

    private double kortingVerzekering; //Korting na 15, 30 en 50 dagen verzekering. 5% - 10% - 15%
    private double totalePrijs; //Prijs incl. of excl. verzekering. Per product is er een andere berekening.
    private boolean isVerhuurd; //of de product beschikbaar is of niet

    private List<Subscriber> subscriberList = new ArrayList<>();

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

    private boolean bepaalverzekeringsPrijs;

    public Product() {
    }

    public void berekenKorting() {

        if ((0 <= dagenVerzekerd) && (dagenVerzekerd < 15)) {
            kortingVerzekering = 1.00; //geen korting
        } else if ((dagenVerzekerd >= 15) && (dagenVerzekerd < 30)) {
            kortingVerzekering = 0.95; //5% korting
        } else if (dagenVerzekerd >= 30) {
            kortingVerzekering = 0.90; //10% korting. verzekering prijs * dit
        }
    }

    public void setHuurPrijs() {

    }

    public double berekenTotaleprijs() {
        return totalePrijs;
    }

        public void setVerzekerd ( boolean verzekerd){
            isVerzekerd = verzekerd;
        }

        public void setVerhuurd ( boolean verhuurd){
            isVerhuurd = verhuurd;
        }

        public boolean isVerhuurd () {
            return isVerhuurd;
        }

        public boolean isVerzekerd () {
            return isVerzekerd;
        }

        public void setDagenVerzekerd ( int dagenVerzekerd){
            this.dagenVerzekerd = dagenVerzekerd;
        }
        public double getKortingVerzekering () {
            return kortingVerzekering;
        }

        public void setKortingVerzekering ( double kortingVerzekering){
            this.kortingVerzekering = kortingVerzekering;
        }


    @Override
    public void subscribe(Subscriber sub) {
        subscriberList.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        subscriberList.remove(sub);
    }

    @Override
    public void opVoorraad() {
        if(isVerhuurd = false){
            notifySubscribers();
        }
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscriberList){
            subscriber.update();
        }
    }
}