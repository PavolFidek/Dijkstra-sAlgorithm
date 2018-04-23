package dijkstrovalgoritmus;

/**
 *
 * @author Fidek
 */
public class DijkstrovAlgoritmus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DijkstrovKod dijkstrov = new DijkstrovKod();
        dijkstrov.naplnVrcholy();
        dijkstrov.vypisVrcholy();
        dijkstrov.pridajHrany();
        dijkstrov.algorithm();
        dijkstrov.vypisPoUkonceniAlgoritmu();
    }
    
}
