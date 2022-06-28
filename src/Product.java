import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Product implements Subject{
    private List<Subscriber> subscriberList = new ArrayList<>();
    private static final AtomicInteger count = new AtomicInteger(0);


    private int id;
    private boolean bestaat; //voor de AtomicInteger
    private boolean isVerhuurd; //of de product beschikbaar is of niet
    private String verhuurd;
    public final void productSetup(){
        //methodes
        //abstract methoden die de subclasses zelf implementeren
    }

    public String getVerhuurd() {
        return verhuurd;
    }

    public Product() {
        bestaat = false;
        id = count.incrementAndGet();
        isVerhuurd = false;
        verhuurd = "Beschikbaar";
    }

    public abstract double berekenHuur(int aantalDagen);
    public abstract double berekenVerzekering(int aantalDagen);

    public void setVerhuurd (boolean huren){
        if (huren = true){
            verhuurd = "Onbeschikbaar";
        }
        if (huren = false) {
            verhuurd = "Beschikbaar";
        }
    }

    public abstract String toString();

    public int getId() {
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