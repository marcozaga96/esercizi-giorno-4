package Esercizi;

import Interfaces.CheckIn;

public abstract class Dipendente  implements CheckIn {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(double stipendio, String matricola, String dipartimento) {
        this.stipendio = stipendio;
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }
    public abstract double calculateSalary();

    @Override
    public void checkin() {
        System.out.println("Dipendente " + matricola + " ha iniziato il turno di lavoro");
    }
}
