
/**
 * classe Veicolo che prevede una targa, una marca e un modello.
 * La classe prevede anche una variabile booleana che descrive se il veicolo `è guasto
 * @author Mihai Iachimovschi
 * @version 28/11/2023
 */
public class Veicolo {
    protected String targa;
    protected String modello;
    protected boolean guasto;

    Veicolo(String targa, String modello, boolean guasto){
        this.targa = targa;
        this.modello = modello;
        this.guasto = guasto;
    }

    @Override
    public String toString(){
        return "Targa: " + targa +"\nModello: " + modello +"\nGuasto: " + guasto;
    }

}
