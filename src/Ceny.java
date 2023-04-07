import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ceny {
    private ArrayList<Integer> zoznam;

    public Ceny() {
        this.zoznam = new ArrayList();
    }

    public void pridajPrvok(int cena) {
        this.zoznam.add(cena);
    }

    public void nacitajPrvky() {
        String cesta = "C:\\Users\\Matúš\\Desktop\\h12\\H2_c.txt";
        try {
            File subor = new File(cesta);
            Scanner sc = new Scanner(subor);
            while (sc.hasNext()) {
                zoznam.add(sc.nextInt());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Súbor neexistuje, skúste skontrolovať názov");
            return;
        }
    }

    public int getCenaAtIndex(int i) {
        return this.zoznam.get(i);
    }

    public int getSize() {
        return this.zoznam.size();
    }

    public int vratSucet() {
        int dokopy = 0;
        for (int i = 0; i < this.zoznam.size(); i++) {
            dokopy +=  this.zoznam.get(i);
        }
        return dokopy;
    }

    public int vratNajmensiPrvok(){
        int najmensi = 10000;
        int index = 0;
        for (int i = 0; i < this.getSize(); i++) {
            if (najmensi > this.zoznam.get(i)) {
                najmensi = this.zoznam.get(i);
            }
        }
        return najmensi;
    }

    public int vratIndexNajmensieho() {
        int najmensi = 10000;
        int index = 0;
        for (int i = 0; i < this.getSize(); i++) {
            if (najmensi > this.zoznam.get(i)) {
                najmensi = this.zoznam.get(i);
                index = i;
            }
        }
        return index;
    }

    public void vymazPrvok(int index) {
        this.zoznam.remove(index);
    }

    public int vratPocetRovnakychPrvkov(int prvok) {
        int pocet = 0;
        for (int cena : this.zoznam) {
            if (cena == prvok) {
                pocet++;
            }
        }
        return pocet;
    }

    public int vratIndexDalsiehoNajmensieho(int indexPredosleho) {
        int najmensi = 10000;
        int index = 0;
        for (int i = indexPredosleho; i < this.getSize(); i++) {
            if (najmensi > this.zoznam.get(i)) {
                najmensi = this.zoznam.get(i);
                index = i;
            }
        }
        return index;
    }

}