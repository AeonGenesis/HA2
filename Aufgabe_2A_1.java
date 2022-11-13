
/*******************************************************************/
/* Der z Wert gibt den Boolschen Wert (1-ja, 0-nein) aus.
Er besagt, ob der gesuchte Wert c and Stelle i des 
maximal 8-stelligen Strings übereinstimmen.
Kurz: Der Wert z zeigt ob c in s vorhanden ist.
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
        while (s.length() >= 8);


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

