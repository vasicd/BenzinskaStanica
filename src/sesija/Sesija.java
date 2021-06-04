/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesija;

import domen.Radnik;

/**
 *
 * @author Dusan
 */
public class Sesija {

    private static Sesija instanca;
    private Radnik radnik;

    private Sesija() {
    }

    public static Sesija getInstanca() {
        if (instanca == null) {
            instanca = new Sesija();
        }
        return instanca;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Radnik getRadnik() {
        return radnik;
    }
}
