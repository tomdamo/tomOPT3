public class VAutoVoorraad extends ProductVoorraad<Vrachtauto>{

    private static final VAutoVoorraad instance = new VAutoVoorraad();

    public VAutoVoorraad() {
    }

    public static VAutoVoorraad getInstance(){
        return instance;
    }
}
