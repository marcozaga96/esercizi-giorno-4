package Esercizi;

public class DipendentePartTime extends Dipendente{
    private int oreLavorative;
    private double pagaOraria;

    public DipendentePartTime(double stipendio, String matricola, String dipartimento, int oreLavorative, double pagaOraria) {
        super(stipendio, matricola, dipartimento);
        this.oreLavorative= oreLavorative;
        this.pagaOraria= pagaOraria;
    }


    @Override
    public double calculateSalary() {
        return oreLavorative * pagaOraria * 20;
    }

    @Override
    public void checkin() {
        super.checkin();
        System.out.println("alle ore 9.00");
    }
}
