package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service serviciu = new Service();
        serviciu.meniu();

        Scanner console  = new Scanner(System.in);

        int optiune = 0;
        while (optiune != 15){
            System.out.print("Optiune: ");
            optiune = console.nextInt();

            switch (optiune) {
                case 0 -> serviciu.print_cabinet();
                case 1 -> serviciu.adauga_client();
                case 2 -> serviciu.adauga_client_VIP();
                case 3 -> serviciu.adauga_dentist();
                case 4 -> serviciu.adauga_secretara();
                case 5 -> serviciu.sterge_client();
                case 6 -> serviciu.sterge_clientVIP();
                case 7 -> serviciu.sterge_dentist();
                case 8 -> serviciu.sterge_secretara();
                case 9 -> serviciu.setare_adresa();
                case 10 -> serviciu.adauga_serviciu();
                case 11 -> serviciu.adauga_programare();
                case 12 -> serviciu.sterge_programare();
                case 13 -> serviciu.modifica_programare();
                case 14 -> serviciu.afisareProgramari();
                case 15 -> System.out.print("EXIT! \n");
                default -> System.out.print("Ati introdus o optiune invalida! \n\n");
            }
        }
    }
}