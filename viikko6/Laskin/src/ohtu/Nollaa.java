/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author henrikorpela
 */
public class Nollaa extends Komento {

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }
    
    @Override
    public void suorita() {
        super.suorita();
        super.sovellus.nollaa();
        super.paivitaKentat();
    }
}
