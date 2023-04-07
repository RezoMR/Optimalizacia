import java.util.ArrayList;
import java.util.Collections;

public class MojaHeuristika {
        private ArrayList<Integer> zoznamVahy;
        private ArrayList<Integer> zoznamCeny;

    public MojaHeuristika() {
        this.zoznamVahy = new ArrayList();
        this.zoznamCeny = new ArrayList();
    }

    public void vykonaj() {
        int cena = 0;
        int vaha = 0;
        int pocetVlozenychPredmetov = 0;

        Ceny kDispoziciiCeny = new Ceny();
        Vahy kDispoziciiVahy = new Vahy();
        kDispoziciiCeny.nacitajPrvky();
        kDispoziciiVahy.nacitajPrvky();

        for (int i = 0; i < 500; i++) {
            this.zoznamCeny.add(kDispoziciiCeny.vratNajmensiPrvok());
            this.zoznamVahy.add(kDispoziciiCeny.vratIndexNajmensieho());
            kDispoziciiCeny.vymazPrvok(kDispoziciiCeny.vratIndexNajmensieho());
            kDispoziciiVahy.vymazPrvok(kDispoziciiCeny.vratIndexNajmensieho());
            System.out.print(i+ " ");
            System.out.print(this.zoznamCeny.get(i) + " ");
            System.out.println(this.zoznamVahy.get(i));
        }





//
//        while (vaha < 10500 || pocetVlozenychPredmetov < 350) {
//                cena += kDispoziciiCeny.vratNajmensiPrvok();
//                vaha += kDispoziciiVahy.getVahaAtIndex(kDispoziciiCeny.vratIndexNajmensieho());
//                pocetVlozenychPredmetov++;
//                kDispoziciiCeny.vymazPrvok(kDispoziciiCeny.vratIndexNajmensieho());
//                kDispoziciiVahy.vymazPrvok(kDispoziciiCeny.vratIndexNajmensieho());
//        }
//
//
//
//        System.out.println(cena + " cena");
//        System.out.println(vaha + " vaha");
//        System.out.println(pocetVlozenychPredmetov+ " pocet vlozenych prvkov");

    }
}
