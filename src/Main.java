import java.util.List;
import java.util.Scanner;

public class Main {
    static ProductVoorraad<Personenauto> pv = PAutoVoorraad.getInstance();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        seed();
        start();

    }

    public static void start() throws InterruptedException {
        System.out.println("Welkom bij het overzichtscherm, de volgende producten zijn beschikbaar:");
        printAuto();
        System.out.println("");
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
                abboneren();
                break;
            default:
                start();
        }




    }

    private static void verhuren() {
    }

    private static void abboneren() throws InterruptedException {
        try {

            System.out.println("");
            System.out.println("Wie wilt abonneren?");
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

        pv.toevoegen(new Personenauto("BMW",500));
        pv.toevoegen(new Personenauto("Audi",700));
        pv.toevoegen(new Personenauto("Tesla",850));
        pv.toevoegen(new Personenauto("Opel",900));
        pv.toevoegen(new Personenauto("Citroen",500));


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
