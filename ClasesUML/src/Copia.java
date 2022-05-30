
import java.util.ArrayList;

public class Copia extends Llibre {

    private String id;

    private String estat;

    private ArrayList<Copia> copies;

    public Copia(String id, String estat) {
        this.id = id;
        this.estat = estat;
    }

    public String getId() {
        return id;
    }

    public String getEstat() {
        return estat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
    
    //Faltaria crear metodes per afegir copies al A.L
    
}
