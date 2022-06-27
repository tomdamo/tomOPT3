public class ProductFactory extends Product {
    public Product makeProduct(String newProductType){

        Product newProduct = null;

        if(newProductType.equals("personenauto")){
            return new Personenauto("",0);
        }
        if(newProductType.equals("vrachtauto")){
            return new Vrachtauto(0,0);
        }
        if(newProductType.equals("boormachine")){
            return new Boormachine("","");
        }
        else return null;
    }

    @Override
    public double berekenHuur(int aantalDagen) {
        return 0;
    }

    @Override
    public double berekenVerzekering(int aantalDagen) {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
