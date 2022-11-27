import java.io.*;

public class Aufgabe_2A_2{


    public static void main(String[] args) throws IOException {
        //Var init
        int n;
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
        
        //korrekte Eingabe prüfen
        do {
            System.out.println("Bitte Ganzzahl n groesser als 1 eingeben: ");
            n = Integer.parseInt(eingabe.readLine());
            System.out.println("eingegebene Zahl: " + n);
        }while (n < 1);

        int out = n;

        int i;
        for (i=0; n > 0; i++){
            n = n/2;
        }
        System.out.println(i);  //Anzahl Zeichen der Binärzahl
        System.out.println(out+ " in binaer ist " + Integer.toBinaryString(out)); //Kontrollausgabe: Eingabe in Binärdarstellun
    }

}

