package Main;
import Cabinet.Cabinet;
import Persoana.Client;
import Persoana.ClientVIP;
import Persoana.Dentist;
import Persoana.Secretara;
import Programare.Programare;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Service {
    final private Cabinet cabinet;
    final private Scanner console;
    public Service(){
        this.cabinet = new Cabinet();
        this.console = new Scanner(System.in);
    }
    public void meniu(){
        String meniu = "Cabinet Stomatologic" + "\n";
        meniu += "0. Afisare detalii cabinet" + "\n";
        meniu += "1. Adauga client" + "\n";
        meniu += "2. Adauga client VIP" + "\n";
        meniu += "3. Adauga dentist" + "\n";
        meniu += "4. Adauga secretara" + "\n";
        meniu += "5. Sterge client" + "\n";
        meniu += "6. Sterge client VIP" + "\n";
        meniu += "7. Sterge dentist" + "\n";
        meniu += "8. Sterge secretara" + "\n";
        meniu += "9. Setare adresa" + "\n";
        meniu += "10. Adauga serviciu" + "\n";
        meniu += "11. Adauga programare" + "\n";
        meniu += "12. Sterge programare" + "\n";
        meniu += "13. Modifica programare" + "\n";
        meniu += "14. Afisare programari" + "\n";
        meniu += "15. EXIT" + "\n";
        System.out.println(meniu);
    }

    public void print_cabinet(){
        System.out.print(cabinet.toString());
    }

    public void adauga_client() {

        System.out.print("Nume client: ");
        String nume = console.nextLine();
        System.out.print("Prenume client: ");
        String prenume = console.nextLine();
        System.out.print("Data nastere: ");
        String data_nastere = console.nextLine();
        System.out.print("CNP: ");
        String CNP = console.nextLine();
        Set<String> servicii = new HashSet<String>();

        System.out.print("Numar servicii dorite: ");
        int nr = console.nextInt();
        String serviciu;
        serviciu = console.nextLine();

        for(int i = 1; i <= nr; i++){
            System.out.print("Serviciul "+i+": ");
            serviciu = console.nextLine();
            servicii.add(serviciu);
        }

        Client client = new Client(nume, prenume, data_nastere,CNP,servicii);
        this.cabinet.adauga_client(client);
        System.out.print("Clientul a fost adaugat cu succes! \n\n");
    }

    public void adauga_client_VIP() {

        System.out.print("Nume client VIP: ");
        String nume = console.nextLine();
        System.out.print("Prenume client VIP: ");
        String prenume = console.nextLine();
        System.out.print("Data nastere: ");
        String data_nastere = console.nextLine();
        System.out.print("CNP: ");
        String CNP = console.nextLine();
        Set<String> servicii = new HashSet<String>();

        System.out.print("Numar servicii dorite: ");
        int nr = console.nextInt();
        String serviciu;
        serviciu = console.nextLine();

        for(int i = 1; i <= nr; i++){
            System.out.print("Serviciul "+i+": ");
            serviciu = console.nextLine();
            servicii.add(serviciu);
        }

        System.out.print("Discount: ");
        int discount = console.nextInt();
        console.nextLine();
        ClientVIP client = new ClientVIP(nume, prenume, data_nastere,CNP,servicii,discount);
        this.cabinet.adauga_clientVIP(client);
        System.out.print("Clientul a fost adaugat cu succes! \n\n");
    }
    public void adauga_dentist() {

        System.out.print("Nume dentist: ");
        String nume = console.nextLine();
        System.out.print("Prenume dentist: ");
        String prenume = console.nextLine();
        System.out.print("Data nastere: ");
        String data_nastere = console.nextLine();
        System.out.print("CNP: ");
        String CNP = console.nextLine();
        Set<String> servicii = new HashSet<String>();
        System.out.print("Calificare: ");
        String calificare = console.nextLine();
        System.out.print("Salariu: ");
        int salariu = console.nextInt();
        console.nextLine();
        Dentist dentist = new Dentist(nume, prenume, data_nastere,CNP, calificare,salariu);
        this.cabinet.adauga_dentist(dentist);
        System.out.print("Dentistul a fost adaugat cu succes! \n\n");
    }

    public void adauga_secretara() {

        System.out.print("Nume secretara: ");
        String nume = console.nextLine();
        System.out.print("Prenume secretara: ");
        String prenume = console.nextLine();
        System.out.print("Data nastere: ");
        String data_nastere = console.nextLine();
        System.out.print("CNP: ");
        String CNP = console.nextLine();
        System.out.print("Salariu: ");
        int salariu = console.nextInt();
        console.nextLine();
        Secretara secretara = new Secretara(nume, prenume, data_nastere,CNP,salariu);
        this.cabinet.adauga_secretara(secretara);
        System.out.print("Secretara a fost adaugata cu succes! \n\n");
    }



    public void sterge_client(){
        System.out.print("CNP client: ");
        String CNP_client = console.nextLine();

        if(cabinet.exista_client(CNP_client)){
            cabinet.sterge_client(CNP_client);
            System.out.print("Clientul a fost sters!\n");
        }
        else{
            System.out.print("Nu exista acest client in sistem! \n\n");
        }
    }

    public void sterge_clientVIP(){
        System.out.print("CNP client VIP: ");
        String CNP_clientVIP = console.nextLine();

        if(cabinet.exista_clientVIP(CNP_clientVIP)){
            cabinet.sterge_clientVIP(CNP_clientVIP);
            System.out.print("Clientul VIP a fost sters!\n");
        }
        else{
            System.out.print("Nu exista acest client VIP in sistem! \n\n");
        }
    }

    public void sterge_dentist(){
        System.out.print("CNP dentist: ");
        String CNP_dentist = console.nextLine();
        if(cabinet.exista_dentist(CNP_dentist)){
            cabinet.sterge_dentist(CNP_dentist);
            System.out.print("Dentistul a fost sters! \n\n");
        }
        else{
            System.out.print("Nu exista acest dentist in sistem! \n\n");
        }
    }

    public void sterge_secretara(){
        System.out.print("CNP secretara: ");
        String CNP_secretara = console.nextLine();
        if(cabinet.exista_secretara(CNP_secretara)){
            cabinet.sterge_secretara(CNP_secretara);
            System.out.print("Secretara a fost stearsa! \n\n");
        }
        else{
            System.out.print("Nu exista aceasta secretara in sistem! \n\n");
        }
    }
    public void setare_adresa(){
        System.out.print("Oras: ");
        String oras = console.nextLine();

        System.out.print("Strada: ");
        String strada = console.nextLine();

        System.out.print("Cod postal: ");
        String cod_postal = console.nextLine();
        System.out.print("\n");

        cabinet.get_adresa().set_oras(oras);
        cabinet.get_adresa().set_strada(strada);
        cabinet.get_adresa().set_cod_postal(cod_postal);
    }

    public void adauga_serviciu(){
        System.out.print("CNP Client:");
        String CNP = console.nextLine();

        boolean verificare = cabinet.exista_client(CNP);
        if(verificare){
            System.out.print("Serviciu: ");
            String serviciu = console.nextLine();
            cabinet.adauga_serviciu(CNP, serviciu);
            System.out.print("Serviciul a fost adaugat cu succes! \n\n");
        }
        else{
            System.out.print("Nu exista acest client in sistem! \n\n");
        }
    }
    public void adauga_programare() {
        SimpleDateFormat zi_luna_an = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("CNP dentist:\n");
        String CNP_dentist = console.nextLine();
        boolean verificare1 = cabinet.exista_dentist(CNP_dentist);
        Dentist d = cabinet.gaseste_dentist(CNP_dentist);

        if(verificare1) {
            System.out.print("Client VIP?:Da/Nu ");
            String answer = console.nextLine();

            while("Da".equals(answer) == false && "Nu".equals(answer) == false) {
                System.out.print(answer);
                System.out.print("Client VIP?:Da/Nu ");
                answer = console.nextLine();
            }

            if ("Nu".equals(answer) == true) {
                System.out.print("CNP client: ");
                String CNP_client = console.nextLine();
                boolean verificare2 = cabinet.exista_client(CNP_client);
                Client c = cabinet.gaseste_client(CNP_client);

                if (verificare2) {
                    System.out.print("Data programare: ");
                    String data = console.nextLine();
                    Date data_prog = new Date();

                    try {
                        data_prog = zi_luna_an.parse(data);
                    } catch (ParseException e) {

                        e.printStackTrace();
                    }

                    System.out.print("Ora programare: ");
                    String ora = console.nextLine();

                    Programare prog_noua;
                    prog_noua = new Programare(c,d, data_prog, ora);
                    this.cabinet.adauga_programare(prog_noua);

                    System.out.print("Programarea a fost adaugata cu succes! \n\n");
                }
                else {
                    System.out.print("Nu exista acest client in sistem! \n\n");
                }
            } else if ("Da".equals(answer) == true) {

                System.out.print("CNP client VIP: ");
                String CNP_clientVIP = console.nextLine();
                boolean verificare2 = cabinet.exista_clientVIP(CNP_clientVIP);
                ClientVIP c = cabinet.gaseste_clientVIP(CNP_clientVIP);

                if (verificare2) {
                    System.out.print("Data programare: ");
                    String data = console.nextLine();
                    Date data_prog = new Date();

                    try {
                        data_prog = zi_luna_an.parse(data);
                    } catch (ParseException e) {

                        e.printStackTrace();
                    }

                    System.out.print("Ora programare: ");
                    String ora = console.nextLine();

                    Programare prog_noua;
                    prog_noua = new Programare(c,d, data_prog, ora);
                    this.cabinet.adauga_programare(prog_noua);
                    System.out.print("Programarea a fost adaugata cu succes! \n\n");
                }
                else {
                    System.out.print("Nu exista acest client VIP in sistem! \n\n");
                }
            }
        }
        else {
            System.out.print("Nu exista acest dentist in sistem! \n\n");
        }
    }
    public void sterge_programare(){
        SimpleDateFormat zi_luna_an = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("CNP dentist: ");
        String CNP_dentist = console.nextLine();

        boolean verificare1 = cabinet.exista_dentist(CNP_dentist);
        Dentist d = cabinet.gaseste_dentist(CNP_dentist);

        if(verificare1) {
            System.out.print("Client VIP?:Da/Nu ");
            String answer = console.nextLine();

            while ("Da".equals(answer) == false && "Nu".equals(answer) == false) {
                System.out.print(answer);
                System.out.print("Client VIP?:Da/Nu ");
                answer = console.nextLine();
            }
            if ("Nu".equals(answer) == true) {
                System.out.print("CNP client: ");
                String CNP_client = console.nextLine();

                boolean verficare2 = cabinet.exista_client(CNP_client);
                Client client = cabinet.gaseste_client(CNP_client);

                if (verficare2) {

                    System.out.print("Data programare: ");
                    String data = console.nextLine();
                    Date data_prog = new Date();

                    try {
                        data_prog = zi_luna_an.parse(data);
                    } catch (ParseException e) {

                        e.printStackTrace();
                    }

                    System.out.print("Ora programare: ");
                    String ora = console.nextLine();
                    Programare prog = cabinet.cauta_programare(cabinet.gaseste_client(CNP_client), cabinet.gaseste_dentist(CNP_dentist), data_prog, ora);
                    if (prog != null) {
                        this.cabinet.sterge_programare(prog);
                        System.out.print("\n");
                        System.out.print("Programarea a fost stearsa cu succes! \n\n");
                    } else {
                        System.out.print("Programarea nu a fost gasita! \n\n");
                    }
                } else {
                    System.out.print("Nu exista acest client in sistem! \n\n");
                }
            } else if ("Da".equals(answer) == true) {

                System.out.print("CNP client VIP: ");
                String CNP_clientVIP = console.nextLine();

                boolean verficare2 = cabinet.exista_clientVIP(CNP_clientVIP);
                ClientVIP client = cabinet.gaseste_clientVIP(CNP_clientVIP);

                if (verficare2) {

                    System.out.print("Data programare: ");
                    String data = console.nextLine();
                    Date data_prog = new Date();

                    try {
                        data_prog = zi_luna_an.parse(data);
                    } catch (ParseException e) {

                        e.printStackTrace();
                    }

                    System.out.print("Ora programare: ");
                    String ora = console.nextLine();
                    Programare prog = cabinet.cauta_programareVIP(cabinet.gaseste_clientVIP(CNP_clientVIP), cabinet.gaseste_dentist(CNP_dentist), data_prog, ora);
                    if (prog != null) {
                        this.cabinet.sterge_programare(prog);
                        System.out.print("\n");
                        System.out.print("Programarea a fost stearsa cu succes! \n\n");
                    } else {
                        System.out.print("Programarea nu a fost gasita! \n\n");
                    }
                }
            }
        }
        else{
            System.out.print("Nu exista acest dentist in sistem! \n\n");
        }
    }

    public void modifica_programare(){

        SimpleDateFormat zi_luna_an = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("CNP dentist: ");
        String CNP_dentist = console.nextLine();

        boolean verificare1 = cabinet.exista_dentist(CNP_dentist);
        Dentist d = cabinet.gaseste_dentist(CNP_dentist);

        if(verificare1) {
            System.out.print("Client VIP?:Da/Nu ");
            String answer = console.nextLine();
            while ("Da".equals(answer) == false && "Nu".equals(answer) == false) {
                System.out.print(answer);
                System.out.print("Client VIP?:Da/Nu ");
                answer = console.nextLine();
            }
            if ("Nu".equals(answer) == true) {
                System.out.print("CNP client: ");
                String CNP_client = console.nextLine();

                boolean verficare2 = cabinet.exista_client(CNP_client);
                Client client = cabinet.gaseste_client(CNP_client);


                if(verficare2) {

                System.out.print("Data programare: ");
                String data = console.nextLine();
                Date data_prog = new Date();
                try {
                    data_prog = zi_luna_an.parse(data);
                } catch (ParseException e) {

                    e.printStackTrace();
                }

                System.out.print("Ora programare: ");
                String ora = console.nextLine();
                Programare prog = cabinet.cauta_programare( cabinet.gaseste_client(CNP_client),cabinet.gaseste_dentist(CNP_dentist), data_prog, ora);
                if(prog != null) {
                    this.cabinet.modifica_programare(prog);
                    System.out.print("\n");
                    System.out.print("Programarea a fost modificata cu succes! \n\n");
                }
                else{
                    System.out.print("Programarea nu a fost gasita! \n\n");
                }
            }
            else{
                System.out.print("Nu exista acest client in sistem! \n\n");
            }
        } else if ("Da".equals(answer) == true) {
                System.out.print("CNP client VIP: ");
                String CNP_clientVIP = console.nextLine();

                boolean verficare2 = cabinet.exista_clientVIP(CNP_clientVIP);
                ClientVIP clientVIP = cabinet.gaseste_clientVIP(CNP_clientVIP);


                if(verficare2) {

                    System.out.print("Data programare: ");
                    String data = console.nextLine();
                    Date data_prog = new Date();

                    try {
                        data_prog = zi_luna_an.parse(data);
                    } catch (ParseException e) {

                        e.printStackTrace();
                    }

                    System.out.print("Ora programare: ");
                    String ora = console.nextLine();
                    Programare prog = cabinet.cauta_programare( cabinet.gaseste_clientVIP(CNP_clientVIP),cabinet.gaseste_dentist(CNP_dentist), data_prog, ora);
                    if(prog != null) {
                        this.cabinet.modifica_programare(prog);
                        System.out.print("\n");
                        System.out.print("Programarea a fost modificata cu succes! \n\n");
                    }
                    else{
                        System.out.print("Nu exista aceasta programare in sistem! \n\n");
                    }
                }
                else{
                    System.out.print("Nu exista acest client in sistem! \n\n");
                }
            }
        } else{
            System.out.print("Nu exista acest dentist in sistem! \n\n");
        }
    }
    public void afisareProgramari(){
        for(Programare prog : cabinet.get_programari()){
            System.out.print(prog + "\n");
        }

    }

}