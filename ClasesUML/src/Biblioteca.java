
import java.util.ArrayList;

public class Biblioteca {

    private String nom;

    private ArrayList<Llibre> llibres;

    public Biblioteca(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    //Faltaria crear metodes per afegir llibres al A.L.
}
