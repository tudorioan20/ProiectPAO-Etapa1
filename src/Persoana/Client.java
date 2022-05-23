package Persoana;

import java.util.Set;

public class Client extends Persoana {
    protected Set<String> servicii;

    public Client()
    {
    }

    public Client(String nume, String prenume, String data_nastere, String CNP, Set<String> servicii)
    {
        super(nume, prenume, data_nastere, CNP);
        this.servicii = servicii;
    }

    public void adauga_serviciu (String serviciu)
    {
        this.servicii.add(serviciu);
    }

    public void set_serviciu(Set<String> servicii)
    {
        this.servicii = servicii;
    }

    public Set<String> get_servicii()
    {
        return servicii;
    }

    @Override
    public String toString() {
        String output = "Client\n";
        output += "Nume: " + this.nume + "\n";
        output += "Prenume: " + this.prenume + "\n";
        output += "Data nastere: " + this.data_nastere + "\n";
        output += "CNP: " + this.CNP + "\n";
        if (servicii.size() > 0) {
            output += "Lista servicii de efectuat: ";
            for (String s : servicii) {
                output += s + " ";
            }
            output += "\n";

        }
            return output;
    }

    }
