/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstrovalgoritmus;

/**
 *
 * @author Fidek
 */
public class Vrchol {
    private String nazov;
    private int vzdialenost;
    private String  vrcholPrichodu;

public Vrchol(String nazov, int vzdialenost, String vrcholPrichodu) {
    this.nazov = nazov;
    this.vzdialenost = vzdialenost;
    this.vrcholPrichodu = vrcholPrichodu;
}

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

public int getVzdialenost() {
    return vzdialenost;
}

public void setVzdialenost(int vzdialenost) {
    this.vzdialenost = vzdialenost;
}

public String getVrcholPrichodu() {
    return vrcholPrichodu;
}

public void setVrcholPrichodu(String vrcholPrichodu) {
    this.vrcholPrichodu = vrcholPrichodu;
}
 
}
