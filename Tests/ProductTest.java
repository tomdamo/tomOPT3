import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product();
    Medewerker medewerker = new Medewerker();

    @org.junit.jupiter.api.Test
    void berekenKorting() {

        product.setDagenVerzekerd(0);
        product.berekenKorting();
        assertEquals(1.00,product.getKortingVerzekering());
        product.setDagenVerzekerd(5);
        product.berekenKorting();
        assertEquals(1.00,product.getKortingVerzekering());
        product.setDagenVerzekerd(14);
        product.berekenKorting();
        assertEquals(1.00,product.getKortingVerzekering());
        product.setDagenVerzekerd(15);
        product.berekenKorting();
        assertEquals(0.95,product.getKortingVerzekering());
        product.setDagenVerzekerd(16);
        product.berekenKorting();
        assertEquals(0.95,product.getKortingVerzekering());
        product.setDagenVerzekerd(29);
        product.berekenKorting();
        assertEquals(0.95,product.getKortingVerzekering());
        product.setDagenVerzekerd(30);
        product.berekenKorting();
        assertEquals(0.90,product.getKortingVerzekering());
        product.setDagenVerzekerd(31);
        product.berekenKorting();
        assertEquals(0.90,product.getKortingVerzekering());
        product.setDagenVerzekerd(100);
        product.berekenKorting();
        assertEquals(0.90,product.getKortingVerzekering());

    }

    @Test
    void bepaalverzekeringsPrijs() {
        //om true te behalen moet isIngelogdTrue zijn, isVerhuurd van product false en isVerzekerd True
        assertFalse(product.isBepaalverzekeringsPrijs(false,false,false));
        assertFalse(product.isBepaalverzekeringsPrijs(false,false,true));
        assertFalse(product.isBepaalverzekeringsPrijs(false,true,false));
        assertFalse(product.isBepaalverzekeringsPrijs(false,true,true));
        assertFalse(product.isBepaalverzekeringsPrijs(true,false,false));
        assertFalse(product.isBepaalverzekeringsPrijs(true,true,false));
        assertTrue(product.isBepaalverzekeringsPrijs(true,true,true));
    }
}