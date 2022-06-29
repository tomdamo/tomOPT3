import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product pAuto1 = new Personenauto("BMW",500);
    Product pAuto2 = new Personenauto("Citroen",900);
    Product pAuto3 = new Personenauto("Opel", 750);

    Product boor1 = new Boormachine("Bosch", "Drill");
    Product boor2 = new Boormachine("Lidl","Knoop");
    Product boor3 = new Boormachine("Gamma","Grond");

    Product vAuto1 = new Vrachtauto(50000,7500);
    Product vAuto2 = new Vrachtauto(75000,10000);
    Product vAuto3 = new Vrachtauto(10000,2000);

    ProductVerzekering product1 = new ProductVerzekering();
    VerzekeringKorting productVerzekerd = new VerzekeringKorting();



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
        assertFalse(product1.isBepaalverzekeringsPrijs(true,false,false));
        assertFalse(product1.isBepaalverzekeringsPrijs(false,true,false));
        assertFalse(product1.isBepaalverzekeringsPrijs(false,false,true));
        assertTrue(product1.isBepaalverzekeringsPrijs(true,true,true));
    }
    @Test
    void testLandingKosten() {
        Vliegtuig vl1 = new Vliegtuig(500,1,true,true);
        Vliegtuig vl2 = new Vliegtuig(500,2,false,false);
        Vliegtuig vl3 = new Vliegtuig(1200,1,false,true);
        Vliegtuig vl4 = new Vliegtuig(1200,2,true,false);
        Vliegtuig vl5 = new Vliegtuig(5100,1,true,true);
        Vliegtuig vl6 = new Vliegtuig(5100,2,false,false);
        assertEquals(1121.0,vl1.berekenLanding(vl1));
        assertEquals(1271.0,vl2.berekenLanding(vl2));
        assertEquals(2405.0,vl3.berekenLanding(vl3));
        assertEquals(3155.0,vl4.berekenLanding(vl4));
        assertEquals(8825.0,vl5.berekenLanding(vl5));
        assertEquals(12575.0,vl6.berekenLanding(vl6));

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