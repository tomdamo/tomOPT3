import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ProductVoorraad<Personenauto> pv = PAutoVoorraad.getInstance();
    static ArrayList<String> verhuurdeProducten = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        seed();
        start();

    }

    public static void start() throws InterruptedException {
        System.out.println("\nWelkom bij het overzichtscherm, het auto overzicht is als volgt:");
        printAuto();
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("Wat wilt u doen? \n Type 1 om een auto toe te voegen. \n Type 2 om een auto te verhuren \n Type 3 om een gebruiker te laten abonneren");

        int input = scanner.nextInt();
        scanner.nextLine();
        switch(input){
            case 1:
                voegToe();
                break;
            case 2:
                verhuren();
                break;
            case 3:
                abonneren();
                break;
            default:
                start();
        }
    }




    private static void verhuren() throws InterruptedException {

        System.out.println("\nVoer de naam in van de verhuurder:");
        String naam = scanner.nextLine();
        printAuto();
        System.out.println("Welke product wilt " + naam + " huren? (Voer getal vd rij in)");
        int gekozen = scanner.nextInt();
        scanner.nextLine();
        //aantal dagen
        System.out.println("Hoeveel dagen wilt " + naam + " het product huren?");
        int dagen = scanner.nextInt();
        scanner.nextLine();
        //prijs berekenen
        double huurKosten = pv.getProduct(gekozen).berekenHuur(dagen);
        System.out.println("Voor " + dagen + " dagen zal het " + huurKosten + " euro bedragen.");
        Thread.sleep(2000);
        //verzekeren?
        System.out.println("Wilt " + naam + " ook het product verzekeren?\n type Y voor ja of N voor nee");
        String verzekeringKeuze = scanner.nextLine();
        double verzKosten;
        if (verzekeringKeuze.equals("Y") || (verzekeringKeuze.equals("y"))) {
            verzKosten = pv.getProduct(gekozen).berekenVerzekering(dagen);
            System.out.println("De verzekering zal dan " + verzKosten + " euro bedragen.");
        } else {
            System.out.println("Geen verzekering kosten");
            verzKosten = 0;
        }
        Thread.sleep(2000);
        System.out.println("");
        double totaal = verzKosten + huurKosten;
        System.out.println("Totale prijs is " + totaal);
        System.out.println("De " + pv.getProduct(gekozen).getMerk().toString() + " is succesvol verhuurd aan " + naam + " voor " + dagen + " dagen.");
        Thread.sleep(5000);
        pv.getProduct(gekozen).setVerhuurd(true);
        start();


    }

    private static void abonneren() throws InterruptedException {
        try {
            System.out.println("\nWie wilt abonneren? Voer de naam in:");
            String naam = scanner.nextLine();
            Subscriber s1 = new Subscriber(naam);
            System.out.println("Van welke auto wilt " + naam + " van op de hoogte zijn?(Voer getal vd rij in)");
            printAuto();
            int gekozen = scanner.nextInt();
            scanner.nextLine();
            s1.subscribeProduct(pv.getProduct(gekozen));
            pv.getProduct(gekozen).subscribe(s1);
            System.out.println("Succesvol geabonneerd");
            pv.getProduct(gekozen).notifySubscribers();
            Thread.sleep(3000);
            System.out.println("");
            start();
        }
        catch (Exception e){
            System.out.println("oops!");
        }
    }

    private static void voegToe() {
        try {
            System.out.println("Voer het merk van de auto in:");
            String merk = scanner.nextLine();
            System.out.println("Voer de gewicht van de auto in: (hele getal)");
            int gewicht = scanner.nextInt();

            pv.toevoegen(new Personenauto(merk,gewicht));
            scanner.nextLine();
            start();
        }
        catch(Exception e) {
            System.out.println("Iets ging fout, probeer het opnieuw!");
        }

    }


    public static void seed(){

        pv.toevoegen(new Personenauto("BMW",1200));
        pv.toevoegen(new Personenauto("Audi",700));
        pv.toevoegen(new Personenauto("Tesla",1350));
        pv.toevoegen(new Personenauto("Opel",900));
        pv.toevoegen(new Personenauto("Citroen",1000));


    }
    public static void printAuto(){

        List<String> names = pv
                .returnAll()
                .stream()
                .map(Personenauto::toString)
                .toList();
            System.out.println(String.join("\n", names));

    }

}
