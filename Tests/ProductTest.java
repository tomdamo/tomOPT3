import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product pAuto1 = new Personenauto();
    Product pAuto2 = new Personenauto();
    Product pAuto3 = new Personenauto();

    Product boor1 = new Boormachine();
    Product boor2 = new Boormachine();
    Product boor3 = new Boormachine();

    Product vAuto1 = new Vrachtauto();
    Product vAuto2 = new Vrachtauto();
    Product vAuto3 = new Vrachtauto();

    ProductVerzekering product1 = new ProductVerzekering();
    VerzekeringKorting productVerzekerd = new VerzekeringKorting();

    Medewerker medewerker = new Medewerker();


    @org.junit.jupiter.api.Test
    void berekenKorting() {
        assertEquals(1.00,productVerzekerd.berekenKorting(0));
        assertEquals(1.00,productVerzekerd.berekenKorting(5));
        assertEquals(1.00,productVerzekerd.berekenKorting(14));
        assertEquals(0.95,productVerzekerd.berekenKorting(15));
        assertEquals(0.95,productVerzekerd.berekenKorting(16));
        assertEquals(0.95,productVerzekerd.berekenKorting(29));
        assertEquals(0.90,productVerzekerd.berekenKorting(30));
        assertEquals(0.90,productVerzekerd.berekenKorting(31));
        assertEquals(0.90,productVerzekerd.berekenKorting(100));
    }

    @Test
    void bepaalverzekeringsPrijs() {
        //om true te behalen moet isIngelogdTrue zijn, isVerhuurd van product false en isVerzekerd True
        assertFalse(product1.isBepaalverzekeringsPrijs(false,false,false));
        assertFalse(product1.isBepaalverzekeringsPrijs(false,false,true));
        assertFalse(product1.isBepaalverzekeringsPrijs(false,true,false));
        assertFalse(product1.isBepaalverzekeringsPrijs(false,true,true));
        assertFalse(product1.isBepaalverzekeringsPrijs(true,false,false));
        assertFalse(product1.isBepaalverzekeringsPrijs(true,true,false));
        assertTrue(product1.isBepaalverzekeringsPrijs(true,true,true));
    }

    @Test
    void testObserver(){

        Subscriber s1 = new Subscriber("Tom");
        Subscriber s2 = new Subscriber("Gizem");
        Subscriber s3 = new Subscriber("Poncik");


        pAuto1.subscribe(s1);
        pAuto1.subscribe(s2);
        pAuto2.subscribe(s1);
        pAuto2.subscribe(s3);
        pAuto1.unsubscribe(s1);

        s1.subscribeProduct(pAuto1);
        s2.subscribeProduct(pAuto2);
        s3.subscribeProduct(pAuto2);

        pAuto1.setVerhuurd(false);
        pAuto2.setVerhuurd(false);
        pAuto1.notifySubscribers();
        pAuto2.notifySubscribers();
    }
    @Test
    void testFactory(){
        ProductFactory productF = new ProductFactory();

        productF.makeProduct("personenauto");
        assertEquals( productF.makeProduct("personenauto").getClass(), pAuto1.getClass());
        assertEquals( productF.makeProduct("vrachtauto").getClass(), vAuto1.getClass());
        assertEquals( productF.makeProduct("boormachine").getClass(), boor1.getClass());

    }
}