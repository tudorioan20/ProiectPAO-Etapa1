package Persoana;

import Persoana.Persoana;

public class Dentist extends Persoana {
    private String calificare;
    private int salariu;
    public Dentist(){}

    public Dentist(String nume,String prenume,String data_nastere ,String CNP, String calificare,int salariu){
        super(nume, prenume,data_nastere,CNP);
        this.calificare = calificare;
    }

    public void set_calificare(String calificare) {
        this.calificare = calificare;
    }

    public String get_calificare() {
        return calificare;
    }

    public void set_salariu(int salariu) {
        this.salariu = salariu;
    }

    public int get_salariu() {
        return salariu;
    }
    @Override
    public String toString() {
        String output = "Dentist:\n";
        output += "Nume: " + this.nume + "\n";
        output += "Prenume: " + this.prenume + "\n";
        output += "Data nastere: " + this.data_nastere + "\n";
        output+= "CNP: " + this.CNP + "\n";
        output+= "Calificare: " +this.calificare + "\n";
        output += "Salariu: " + this.salariu + "\n";
        return output;
    }
}