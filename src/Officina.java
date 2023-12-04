/**
 * CLasse Officina che ha solo il metodo ripara
 *
 * @author Mihai Iachimovschi
 * @version 28/11/2023
 */

public class Officina {


    public double  ripara(Veicolo veicolo){
        if(!veicolo.getGuasto()){
            return 15;
        }

        if(veicolo instanceof Vettura){
            veicolo.setGuasto(false);

            switch (((Vettura) veicolo).getTipologia()) {
                case "utilitaria" -> {
                    return 500;
                }
                case "station wagon" -> {
                    return 700;
                }
                case "SUV" -> {
                    return 1000;
                }
            }


        }
        else if(veicolo instanceof Motociclo) {
            veicolo.setGuasto(false);

            switch (((Motociclo) veicolo).getCilindrata()) {
                case 125:
                    return 50;
                case 600:
                    return 300;

                case 1000:
                    return 500;
            }
        }

        return -1;
    }
}
