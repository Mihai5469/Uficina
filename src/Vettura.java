/**
 * La classe Vettura prevede una stringa che ne descrive la tipologia ("utilitaria", "station wagon", "SUV",....)
 * ed estende la casse Veicolo
 * @author Mihai Iachimovschi
 * @version 28/11/2023
 */

public class Vettura extends Veicolo{
    private final String tipologia;

    Vettura(String targa, String modello, boolean guasto, String tipologia){
        super(targa, modello, guasto);
        this.tipologia = tipologia;
    }

    public String getTipologia(){
        return tipologia;
    }

    public boolean tipo(String tipologia){
        return this.tipologia.equals(tipologia);
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipologia: "+tipologia;
    }
}
