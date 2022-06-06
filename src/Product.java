import java.util.ArrayList;
import java.util.List;

public abstract class Product implements Subject{
    private List<Subscriber> subscriberList = new ArrayList<>();

    private boolean isVerhuurd; //of de product beschikbaar is of niet
    private double huurprijs;

    public final void productSetup(){
        //methodes
        //abstract methoden die de subclasses zelf implementeren
    }

    public Product() {
    }

    public void setVerhuurd ( boolean verhuurd){
        isVerhuurd = verhuurd;
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