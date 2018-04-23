
package dijkstrovalgoritmus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fidek
 */
public class DijkstrovKod {
    private ArrayList<Vrchol> vrcholy;
    private ArrayList<Hrana> hrany;
    private Scanner skener;
    private Scanner skener1;
    private int pocetVrcholov;
    private int pocetHran;
    private int nekonecno;

    public DijkstrovKod() {
        vrcholy = new ArrayList<Vrchol>();
        hrany = new ArrayList<Hrana>();
        this.pocetVrcholov = pocetVrcholov;
        skener = new Scanner(System.in);
        skener1 = new Scanner(System.in);
    }
    // metoda naplnVrcholy() pridava postupne pocet vrcholov ktory sme zadali, vrcholy idu podla abcedy od A 
    public void naplnVrcholy() {
        System.out.println("Zadajte pocet vrcholov: ");
        pocetVrcholov = skener.nextInt();
        for (int i=0; i < pocetVrcholov; i++) {
            nekonecno = (int)(Double.POSITIVE_INFINITY);
            if(i==0) {          //pre prvy vrchol potrebujeme nastavit vzdialenost 0 
                String menoVrcholu = Character.toString((char)(i+65)); //pretipovanie int na String, z i=0 dostanem A
                Vrchol vrchol = new Vrchol(menoVrcholu, 0, "");        //vrcholu nastavim vzdialenost a vrcholPrichodu 
                vrcholy.add(vrchol);
            } else {            //ostatne budu mat nekonecno alebo v tomto pripade 9999 (lebo tuto hodnotu v mensich grafoch nepresiahnem)
                String menoVrcholu = Character.toString((char)(i+65)); //pretipovanie int na String, z i=0 dostanem A
                Vrchol vrchol = new Vrchol(menoVrcholu,nekonecno, "");    //vrcholu nastavim vzdialenost a vrcholPrichodu 
                vrcholy.add(vrchol);
            }
        }
    }

    public void vypisVrcholy() {
        for(Vrchol vrchol : vrcholy) {
            System.out.println("V(" + vrchol.getNazov() + ")");
        }
    } 
    
    public void pridajHrany() {
        System.out.println("Zadajte pocet hran: ");
        pocetHran = skener.nextInt();
        for(int i=0; i < pocetHran; i++) {
            System.out.println("Zadajte " + (i+1) + ". hranu, v tvare (zaciatocnyVrchol-koncovyVrchol-cenaHRany).");
            String hrana = skener1.nextLine();
            String[] rozdelenaHrana = new String[3];    //vytvorim pole pre hranu
            rozdelenaHrana = hrana.split("-");          ///zaadny string potrebujem rozdelit na 3 parametre tak ho delim splitom("-")
            hrany.add(new Hrana(rozdelenaHrana[0], rozdelenaHrana[1], Integer.parseInt(rozdelenaHrana[2])));  //nasledne priradim jednotlive parametre podla indexov hrane
        }
    }
    public void algorithm() {
        int pom = 0;
        int pom1 = 0;
        for (int i=0; i < pocetVrcholov; i++) {
            for(Hrana hrana : hrany) {
                if(hrana.getZaciatokHrany().equals(Character.toString((char)(i+65)))) {         //vyberam hrany so aciatocnym vrcholom abesedne teda od A
                    for(Vrchol vrchol : vrcholy) {          //hladam zaciatocny vrchol hrany 
                        if(vrchol.getNazov().equals(hrana.getZaciatokHrany())) {        //ak sa vrchol zhoduje zo zaciatkom hrany 
                            pom = vrchol.getVzdialenost();          //pom je vzdialenost zaciatocneho vrchola hrany
                            for(Vrchol vrcholEnd : vrcholy) {       //hladam koncovy vrchol hrany
                                if(vrcholEnd.getNazov().equals("A")) {
                                    //podmienka aby nehladal najkratsiu cestu do vrchola z ktorho vysiel
                                } else {
                                    if(vrcholEnd.getNazov().equals(hrana.getKoniecHRany())) {       //
                                        pom1 = vrcholEnd.getVzdialenost();          //vzdialenost koncoveho vrchola                    
                                        if( pom1 > pom + hrana.getCenaHrany() ) {     //podmienka ci je vzdialenost zaciatocneho vrchola + cena hrany mensia ako vzdialenost koncoveho vrchola    
                                            vrcholEnd.setVzdialenost(pom + hrana.getCenaHrany());         //koncovemu vrcholu nastavim vzdialenost vzdial. zaciatoc. vrchola + cena hrany
                                            vrcholEnd.setVrcholPrichodu(hrana.getZaciatokHrany());        //ako vrchol prichodu nastavim zaciatocny vrchol hrrany                     
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void vypisPoUkonceniAlgoritmu() {
        for(Vrchol vrchol : vrcholy) {
            System.out.println("Vrchol " + vrchol.getNazov() + ": " + vrchol.getVzdialenost() + "/" + vrchol.getVrcholPrichodu());
        }
    }
} 
