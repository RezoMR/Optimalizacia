import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class main{

    public static void main(String[] args) throws IOException, FileNotFoundException {

        //dualna vsuvacia heuristika
        int cena =0;
        int vaha = 0;
        int pocetVlozenychPredmetov =0;

        int chcenaVaha = 10500;
        int chcenyPocetPrvkov = 350;

        Ceny kDispoziciiCeny = new Ceny();
        Vahy kDispoziciiVahy = new Vahy();
        kDispoziciiCeny.nacitajPrvky();
        kDispoziciiVahy.nacitajPrvky();

        while (vaha < 10500 || pocetVlozenychPredmetov < 350) {
            cena += kDispoziciiCeny.getCenaAtIndex(kDispoziciiCeny.vratIndexNajmensieho());
            vaha += kDispoziciiVahy.getVahaAtIndex(kDispoziciiCeny.vratIndexNajmensieho());
            pocetVlozenychPredmetov++;
            kDispoziciiCeny.vymazPrvok(kDispoziciiCeny.vratIndexNajmensieho());
            kDispoziciiVahy.vymazPrvok(kDispoziciiCeny.vratIndexNajmensieho());
        }

        System.out.println(cena + " cena");
        System.out.println(vaha + " vaha");
        System.out.println(pocetVlozenychPredmetov+ " pocet vlozenych prvkov");
        //dualna vsuvacia koniec

        //moja heuristika vlož najmenšiu váhu
        MojaHeuristika moja = new MojaHeuristika();

        System.out.println();
        System.out.println("Moja Heuristika");
        moja.vykonaj();
    }

}