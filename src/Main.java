import java.util.List;
import java.util.Scanner;

public class Main {
    static ProductVoorraad<Personenauto> pv = PAutoVoorraad.getInstance();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        seed();
        start();

    }

    public static void start(){
        System.out.println("Welkom bij het overzichtscherm, de volgende producten zijn beschikbaar:");
        printAuto();
        System.out.println("");
        System.out.println("Wat wilt u doen? \n Type X om een auto toe te voegen. \n Type Y om een gebruiker te laten abboneren");
        String input = scanner.nextLine();

        if (input.equals("x") || input.equals("X")){
            voegToe();
        }
        if (input.equals("y") || input.equals("Y")){

        }
        else{
            System.out.println("Programma stopt");
            System.exit(0);
        }


    }

    private static void voegToe() {
        try {
            System.out.println("Voer het merk van de auto in:");
            String merk = scanner.nextLine();
            System.out.println("Voer de gewicht van de auto in: (hele getal)");
            int gewicht = scanner.nextInt();
            pv.toevoegen(new Personenauto(merk,gewicht));
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
