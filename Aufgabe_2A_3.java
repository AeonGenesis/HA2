import java.io.*;

public class Aufgabe_2A_3 {
    public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        int n;
        
        do {
            System.out.println("Wie viele reihen?");
            n = Integer.parseInt(eingabe.readLine());
        } while (n < 3);
        
        for (int i = 1; i <= n; ++i) { // i=1 für erste zeile, so lange wiederholt bis n reihen ausgegeben werden
            for (int j = 1; j <= i; ++j) { // so lange wiederholt bis j = i = n gleiche zahlen sind
                System.out.print("*");
            }
            
            //Zeilenvorschub
            System.out.println();
        }
    }
    
}
