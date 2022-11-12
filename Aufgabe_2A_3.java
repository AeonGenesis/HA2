import java.io.*;

public class Aufgabe_2A_3 {
    public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        int rows;

        System.out.println("Wie viele reihen?");
        rows = Integer.parseInt(eingabe.readLine());
        //if rows is below 3, repeat input!!!

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
