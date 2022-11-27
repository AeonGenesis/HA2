import java.io.*;

public class Aufgabe_2A_3 {
    public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        int n;
        
        do {
            System.out.println("Wie viele Reihen?");
            n = Integer.parseInt(eingabe.readLine());
        } while (n <= 3);
        
        for (int i = 1; i <= n; ++i) { //Anzahl Reihen
            for (int j = 1; j <= i; ++j) { // Anzahl Sternchen in Relation zu Reihen
                System.out.print("*");
            }
            
            System.out.println(); //Zeilenvorschub
        
        }
    }
    
}
