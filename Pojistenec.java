
import java.time.LocalDate;
import java.util.LinkedList;

public class Pojistenec {
    
    private final LocalDate pojistenOd;
    private final String jmeno;
    private final String prijmeni;
    private final String telefon;
    private final int vek;
    /*
    private final boolean zivotniPojisteni;
    private final boolean bydleniPojisteni;
    private final boolean autoPojisteni;
    private final boolean cestovniPojisteni;
 */ 

    public Pojistenec(LocalDate pojistenOd, String jmeno, String prijmeni, String telefon, int vek) {
        this.pojistenOd = pojistenOd;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;
    }


    public LocalDate getDatum() {
        return pojistenOd;
    }

    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public String getTelefon() {
        return telefon;
    }
    public int getVek() {
        return vek;
    }
    

}
