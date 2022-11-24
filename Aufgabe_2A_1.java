
/*******************************************************************/
/* Z-Wert gibt Anzahl des gesuchten C-Werts im String S aus
/*******************************************************************/

import java.io.*;


public class Aufgabe_2A_1{
    public static void main(String[] args) throws IOException {
        //Var init
        String s = "start";
        char c = 'A';
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

        
        //korrekte Eingabe prüfen
        do {
            System.out.println("Bitte String kürzer als 8 eingeben: ");
            s = new String(eingabe.readLine());
            System.out.println("Gelesener String: " + s);
            System.out.println("s.length(): " + s.length());
        }
        while (s.length() > 8);

        //Char Eingabe
        System.out.println("Bitte char-Wert eingeben: ");
        c = (char) eingabe.read(); 
        eingabe.readLine(); // wichtig: entfernt das Enter-Zeichen aus dem Eingabepuffer
        System.out.println("Gelesener char-Wert: " + c);
        System.out.println();
        //System.out.println(s.indexOf(c)+1);

        int z = 0;
        int i;
        for (i=0; s.length()-1 >= i; i++){
            if (c == s.charAt(i)) {
                z++;
            } 
            else {
            }       
        }

        System.out.println(z); 
    }

}

