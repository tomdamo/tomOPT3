import java.util.ArrayList;
import java.util.List;

public abstract class Product implements Subject{
    private List<Subscriber> subscriberList = new ArrayList<>();

    private boolean isVerhuurd; //of de product beschikbaar is of niet
    private double huurprijs; //prijs van product
    private double verzekeringPrijs; //prijs

    ProductFactory pf = new ProductFactory();
    public final void productSetup(){
        //methodes die nodig zijn om een product te maken
        selectProductType(); //returns string die naar productFactory wordt gestuurd
        addToList();
        createId(); //id van de gemaakte product, automatisch op basis van arraylist size -1.
        createPrice(); //huurprijs van de gemaakte product, als product type Personenauto is etc, dan ...€ etc.
        createVerzekering(); //verzekering beschikbaar maken, prijs van de verzekering
    }

    private void addToList(){

    }

    abstract void selectProductType();

    abstract void createPrice();

    abstract void createVerzekering();

    private void createId() {

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