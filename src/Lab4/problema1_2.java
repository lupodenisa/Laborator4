package Lab4;
import java.util.Scanner;
public class problema1_2 {
    public static void main(String[] args) {
        int optiune;
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("Introduceti optiunea: ");
            optiune = myObj.nextInt();
            switch (optiune) {
                case 1:
                    System.out.println("Introduceti cuvantul: ");
                    myObj.nextLine();
                    String cuvant = myObj.nextLine();
                    problema1(cuvant);
                    break;
                case 2:
                    System.out.println("Introduceti un numar: ");
                    int nr = myObj.nextInt();
                    problema2(nr);
                    break;
                case 0:
                    System.out.println("Iesire din program!! ");
                    break;
                default:
                    System.out.println("Valoare invalida!! ");
                    break;
            }
        } while (optiune != 0);
    }
    public static void problema1(String cuvant) {
        int lungime = cuvant.length();
        if (lungime % 2 == 0) {
            char literaStanga = cuvant.charAt(lungime / 2 - 1);
            char literaDreapta = cuvant.charAt(lungime / 2);
            System.out.println("Cele doua litere sunt: " + literaStanga + literaDreapta);
        } else {
            char literaMijloc = cuvant.charAt(lungime / 2);
            System.out.println("Litera din mijloc este: " + literaMijloc);
        }
    }
    public static void problema2(int nr) {
        int s = 0;
        int cifra;
        int Temp = nr;

        while (Temp > 0) {
            cifra = Temp % 10;
            s += cifra;
            Temp /= 10;
        }

        System.out.println("Suma cifrelor numarului " + nr + " este " + s);
    }
}
