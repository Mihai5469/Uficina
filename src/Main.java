/**
 * @author Mihai Iachimovschi
 * @version 28/11/2023
 */

public class Main {

    public static void main(String[] args) {
        Officina o = new Officina();

        Vettura v1 = new Vettura("vet1", "Mercedes", false, "utilitaria");
        Vettura v2 = new Vettura("vet2", "Mercedes", true, "utilitaria");

        Motociclo m1 = new Motociclo("mot1","Aprilia", true, 125);


        Veicolo[] veicoli = new Veicolo[3];
        veicoli[0] = v1;
        veicoli[1] = v2;
        veicoli[2] = m1;

        for(int i = 0; i <3; i++){
            System.out.println(veicoli[i].getTarga());
        }

        System.out.println("Il prezzo della riparazione: "+o.ripara(m1));
    }
}
