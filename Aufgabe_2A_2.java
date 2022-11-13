import java.io.*;

public class Aufgabe_2A_2{


    public static void main(String[] args) throws IOException {
        //Var init
        int n;
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
        
        //korrekte Eingabe prüfen
        do {
            System.out.println("Bitte Granzzahl n groesser als 1 eingeben: ");
            n = Integer.parseInt(eingabe.readLine());
            System.out.println("eingegebene zahl: " + n);
        }while (n < 1);

        int out = n;
        //Char Eingabe
        //int max = (int) Math.pow(2, n);
        int i;
        for (i=0; n > 0; i++){
            n = n/2;
        }
        System.out.println(i);  
        System.out.println(out+ " in binaer ist " + Integer.toBinaryString(out));       
    }

}

