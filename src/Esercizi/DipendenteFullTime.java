package Esercizi;

public class DipendenteFullTime extends Dipendente{
    public DipendenteFullTime(double stipendio, String matricola, String dipartimento) {
        super(stipendio, matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    @Override
    public void checkin() {
        super.checkin();
        System.out.println("alle ore 9.00");
    }
}
