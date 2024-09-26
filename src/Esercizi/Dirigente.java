package Esercizi;

public class Dirigente extends Dipendente{
    public Dirigente(double stipendio, String matricola, String dipartimento) {
        super(stipendio, matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    @Override
    public void checkin() {
        super.checkin();
        System.out.println("alle ore 10.00");
    }
}
