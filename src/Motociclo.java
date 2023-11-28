/**
 *  Motociclo prevede un numero che ne descrive la cilindrata (50, 125, ....).
 *  Estende la classe Veicolo
 * @author Mihai Iachimovschi
 * @version 28/11/2023
 */

public class Motociclo extends Veicolo{
    private int cilindrata;

    Motociclo(String targa, String modello, boolean guasto, int cilindrata) {
        super(targa, modello, guasto);
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString(){
        return super.toString()+"\nCilindrata: "+cilindrata;
    }
}
