public class Subscriber implements Observer {

    private String naam;

    private Product product = new Personenauto("",0);

    public Subscriber(String naam){
        this.naam = naam;
    }

    @Override
    public void update() {
        System.out.println("Stuur mail naar " + naam + ", de product is op vorraad");
    }

    @Override
    public void subscribeProduct(Product pr) {
        product = pr;
    }

    //een Klant kan "subscriben" op een product om een bericht te krijhgen indien het beschikbaar is.
}
