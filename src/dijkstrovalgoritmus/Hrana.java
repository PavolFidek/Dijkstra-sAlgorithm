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
public class Hrana {
    private String zaciatokHrany;
    private String koniecHRany;
    private int cenaHrany;

    public Hrana(String zaciatokHrany, String koniecHRany, int cenaHrany) {
        this.zaciatokHrany = zaciatokHrany;
        this.koniecHRany = koniecHRany;
        this.cenaHrany = cenaHrany;
    }

    public String getZaciatokHrany() {
        return zaciatokHrany;
    }

    public void setZaciatokHrany(String zaciatokHrany) {
        this.zaciatokHrany = zaciatokHrany;
    }

    public String getKoniecHRany() {
        return koniecHRany;
    }

    public void setKoniecHRany(String koniecHRany) {
        this.koniecHRany = koniecHRany;
    }

    public int getCenaHrany() {
        return cenaHrany;
    }

    public void setCenaHrany(int cenaHrany) {
        this.cenaHrany = cenaHrany;
    }

    
}
