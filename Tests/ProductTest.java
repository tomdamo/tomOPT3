import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product pAuto1 = new Personenauto(1000, "BMW",500);
    Product pAuto2 = new Personenauto(1001,"Ford",600);
    Product pAuto3 = new Personenauto(1002,"Opel",700);

    Product boor1 = new Boormachine(2000,"Bosch","drill");
    Product boor2 = new Boormachine(2001,"Lidl","klop");
    Product boor3 = new Boormachine(2002,"DeWalt","hamer");

    Product vAuto1 = new Vrachtauto(3000,25000,2000);
    Product vAuto2 = new Vrachtauto(3001,35000,3000);
    Product vAuto3 = new Vrachtauto(3002,40000,3500);

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
}