public interface Subject {

    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    //indien een product weer teruggebracht is
    void opVoorraad();

    //klant wilt een bericht krijgen als een product weer op voorraad is
    void notifySubscribers();
}
