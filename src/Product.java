import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Product implements Subject{
    private List<Subscriber> subscriberList = new ArrayList<>();


    private UUID id;
    private boolean isVerhuurd; //of de product beschikbaar is of niet
    private double huurprijs;

    public final void productSetup(){
        //methodes
        //abstract methoden die de subclasses zelf implementeren
    }

    public Product() {
        this.id = UUID.randomUUID();
    }

    public abstract double berekenHuur(int aantalDagen);
    public abstract double berekenVerzekering(int aantalDagen);

    public void setVerhuurd ( boolean verhuurd){
        isVerhuurd = verhuurd;
    }

    public abstract String toString();

    public UUID getId() {
        return id;
    }

    @Override
    public void subscribe(Subscriber sub) {
        subscriberList.add(sub);
        //sub.subscribeProduct();
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