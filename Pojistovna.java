
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Pojistovna {
   
    public LinkedList<Pojistenec> pojistenci = new LinkedList<Pojistenec>();

    void VytiskniMenu() {
        System.out.println("------------------------------------------ ");
        System.out.println("-------------   pojistovna   -------------");
        System.out.println("příkazy pro ovládání:");
        System.out.println("- novy: Vytvoření nového záznamu");
        System.out.println("- zaznamy: Zobrazí všechny záznamy");
        System.out.println("- vyhledat: Vyhledá záznamy podle jména");
        System.out.println("- smaz: Odstranění záznamu");
        System.out.println("- zavri: Zavření deníku a ukončení programu");
        System.out.println("------------------------------------------ ");
           
     
        System.out.println("------------------------------------------ ");
        System.out.println("Počet záznamů: " + pojistenci.size());
        System.out.println("------------------------------------------ ");
        
      



    }
    void VystiskniNovy(String jmeno, String prijmeni, String telefon, int vek){
    
       LocalDate pojistenOd = LocalDate.now();
       pojistenci.add(new Pojistenec(pojistenOd, jmeno, prijmeni, telefon, vek));
       System.out.println("Záznam byl vytvořen");
       VytiskniMenu();
        System.out.println("------------------------------------------ ");
        System.out.println("Poslední záznam: "); 
        System.out.print(pojistenci.getLast().getJmeno() + " ");
        System.out.println(pojistenci.getLast().getPrijmeni());
        System.out.println("Vytvořen: " + pojistenci.getLast().getDatum());
        System.out.println("------------------------------------------ ");


      


    }
    public String vypisPojistence() {
        String pojistenciString = "";
        if (!pojistenci.isEmpty()) {  
          
        System.out.println("------------------------------------------ ");
        System.out.println("Počet záznamů: " + pojistenci.size());
        System.out.println("------------------------------------------ ");

        for(Pojistenec pojistenec : pojistenci){
            pojistenciString += pojistenec.getJmeno() + " " + pojistenec.getPrijmeni() + " pojištěn od " + pojistenec.getDatum() + " telefon: " + pojistenec.getTelefon() + " věk: " + pojistenec.getVek() + "\n";
            pojistenciString += "\n------------------------------------------\n";
        }
        return pojistenciString;
        
    }
    else
     return "Žádné záznamy nebyly nalezeny";
    }
    
    void smazPojistence(){
       
        System.out.println("------------------------------------------ ");
        System.out.println("Počet záznamů: " + pojistenci.size());
        System.out.println("------------------------------------------ ");
        System.out.println("------------------------------------------ ");

        for(Pojistenec pojistenec : pojistenci){
            System.out.printf("Záznam [%d] vytvořen " + pojistenec.getDatum() + ":\n", pojistenci.indexOf(pojistenec));
            System.out.printf("\n\n");
        }
       
        System.out.println("------------------------------------------ ");
    }

      void ktery(String smaz) {
        for (Pojistenec pojistenec : pojistenci) {
        if (pojistenec.getJmeno().equals(smaz)) {
        pojistenci.remove(pojistenec);
        System.out.println("Záznam " + smaz + " byl vymazán");
        }
        else 
        {
            System.out.println("zaznam nebyl nalezen");
        }

    }
    }	
    void vyhledatPojistence(String hledat){
        for (Pojistenec pojistenec : pojistenci) {
        if (pojistenec.getJmeno().equals(hledat)) {
        System.out.println("Záznam: " + pojistenec.getJmeno() + " " + pojistenec.getPrijmeni() + " pojištěn od " + pojistenec.getDatum() + " telefon: " + pojistenec.getTelefon() + " věk: " + pojistenec.getVek());
        }
        else 
        {
            System.out.println("zaznam nebyl nalezen");
        }
        }
    }
    
}
