/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;
import sesija.Sesija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Dusan
 */
public class Kontroler {
    private static Kontroler instance;
    Sesija sesija; //Bojan mi je rekao da dodam ovu sesiju

    public Kontroler() {
    }

    public static Kontroler getInstance() {
        if(instance == null)
            instance = new Kontroler();
        return instance;
    }

    public ServerskiOdgovor ulogujSe(String ime, String sifra) {
        KlijentskiZahtev kz = new KlijentskiZahtev();
      //  kz.setOperacija(Operacije.LOGOVANJE);
       // kz.setParametar(new Administrator(0, "", "", ime, sifra));
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        return KomunikacijaSaServerom.getInstance().primiOdgovor();
    }

}
