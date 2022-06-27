public class BVoorraad extends ProductVoorraad<Boormachine>{

    private static final BVoorraad instace = new BVoorraad();

    public BVoorraad(){

    }
    public static BVoorraad getInstance(){
        return instace;
    }
}
