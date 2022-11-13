import java.io.*;

public class Aufgabe_2A_3 {
    public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        int rows;
        
        do {
            System.out.println("Wie viele reihen?");
            rows = Integer.parseInt(eingabe.readLine());
        } while (rows < 4);
        
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            
            //Zeilenvorschub
            System.out.println();
        }
    }
    
}
