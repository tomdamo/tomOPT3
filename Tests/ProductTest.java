import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product();

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
}