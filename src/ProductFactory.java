public class ProductFactory {
    public Product makeProduct(String newProductType){

        Product newProduct = null;

        if(newProductType.equals("personenauto")){
            return new Personenauto();
        }
        if(newProductType.equals("vrachtauto")){
            return new Vrachtauto();
        }
        if(newProductType.equals("boormachine")){
            return new Boormachine();
        }
        else return null;
    }
}
