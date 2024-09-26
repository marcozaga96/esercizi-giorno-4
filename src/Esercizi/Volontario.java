package Esercizi;

import Interfaces.CheckIn;

public class Volontario implements CheckIn {
    private String nome;
    private int età;
    private String cv;

    public Volontario(int età, String cv, String nome) {
        this.età = età;
        this.cv = cv;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkin() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio volontario alle 12.00.");
    }
}
