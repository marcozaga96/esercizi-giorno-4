import Esercizi.*;
import Interfaces.CheckIn;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendentePartTime(0, "001", "produzione",5,8.5);
        Dipendente dipendente2 = new DipendenteFullTime(2500.00, "002", "vendite");
        Dipendente dipendente3 = new Dirigente(3000.00, "003", "amministrazione");
        Volontario volontario1 = new Volontario(25,"CV di Marco","Marco");

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
        CheckIn[] persone= {dipendente1, dipendente2, dipendente3, volontario1};

        for (CheckIn persona : persone){
            persona.checkin();

        }

        for (Dipendente dip : dipendenti) {
            System.out.println("Matricola: " + dip.getMatricola() +" avente il ruolo di: "+ dip.getDipartimento() + " guadagna mensilmente:" + dip.calculateSalary());
        }

    }
}