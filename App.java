
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String vstup = "";
        Scanner sc = new Scanner(System.in);
        Pojistovna pojistovna = new Pojistovna();
do {
        pojistovna.VytiskniMenu();
        vstup = sc.nextLine();
switch (vstup) {
    case "novy":
        System.out.println("Zadejte jméno: ");
       String jmeno = sc.nextLine();
         System.out.println("Zadejte příjmení: ");
         String prijmeni = sc.nextLine();
            System.out.println("Zadejte telefon: ");
            String telefon = sc.nextLine();
            System.out.println("Zadejte věk: ");
            int vek = sc.nextInt();
            pojistovna.VystiskniNovy(jmeno, prijmeni, telefon, vek);
        break;
    case "zaznamy":
       System.out.println(pojistovna.vypisPojistence());
        break;
        case "smaz":
        pojistovna.smazPojistence();
    System.out.println("Zadejte jméno klienta ke smazání: ");
    String smaz = sc.nextLine();
    pojistovna.ktery(smaz);
        break;
    case "vyhledat":
    System.out.println("------------------------------------------ ");
     System.out.println("Zadejte jméno pojištěnce: ");
    String hledat = sc.nextLine();
    pojistovna.vyhledatPojistence(hledat);
        break;
    case "zavri":
        System.out.println("Ukončuji program");
        vstup = "zavri";
        break;
}
} while ( !vstup.equals("zavri"));





        
}
}