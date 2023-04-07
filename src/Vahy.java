import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Vahy {
    private ArrayList<Integer> zoznam;

    public Vahy() {
        this.zoznam = new ArrayList();
    }

    public void pridajPrvok(int vaha) {
        this.zoznam.add(vaha);
    }

    public void nacitajPrvky() {
        String cesta2 = "C:\\Users\\Matúš\\Desktop\\h12\\H2_a.txt";
        try {
            File subor = new File(cesta2);
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

    public int getVahaAtIndex(int index) {
        return this.zoznam.get(index);
    }
    public void vymazPrvok(int index){
        this.zoznam.remove(index);
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
    public int vratIndexNajvacsieho() {
        int najvacsi = 0;
        int index = 0;
        for (int i = 0; i < this.getSize(); i++) {
            if (najvacsi < this.zoznam.get(i)) {
                najvacsi = this.zoznam.get(i);
                index = i;
            }
        }
        return index;
    }

    public int vratNajvacsi(){
        int najvacsi = 0;
        int index = 0;
        for (int i = 0; i < this.getSize(); i++) {
            if (najvacsi < this.zoznam.get(i)) {
                najvacsi = this.zoznam.get(i);
            }
        }
        return najvacsi;
    }
}