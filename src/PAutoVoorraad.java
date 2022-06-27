public class PAutoVoorraad extends ProductVoorraad<Personenauto>{

    private static final PAutoVoorraad instance = new PAutoVoorraad();

    public PAutoVoorraad(){

    }
    public static PAutoVoorraad getInstance(){
        return instance;
    }
}
