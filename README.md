# HA2
 ## Aufgabe_2A_1 

 Schreiben Sie ein entsprechendes Java-Programm in einer Datei `Aufgabe_2A_1.jav`a und führen Sie es aus. 
 
__Wichtig__: 
Das Programm soll dem Struktogramm genau entsprechen; abweichende Lösungen werden nicht anerkannt!
Was macht dieser Algorithmus also? Schreiben Sie die Antwort auf die Frage als Kommentar oben in die Datei `Aufgabe_2A_1.java`. 
Die Antwort soll möglichst knapp und treffend sein – 
beschreiben Sie also nicht die Vorgehensweise, **sondern sagen Sie nur, was der Endwert von z besagt**!

------------
__Zusatzaufgaben Für etwas Anspruchsvollere:__
• Erweitern Sie Struktogramm und Programm so, dass der Algorithmus mehrfach hintereinander
ausgeführt wird, solange der/die Benutzer(in) das wünscht.
• Erweitern Sie das Programm so, dass ein zweiter String erzeugt wird, der aus s entsteht, in dem Sie alle Vorkommen von c streichen.

 ## Aufgabe_2A_2
Erstellen Sie zuerst ein Struktogramm für den folgenden Algorithmus:

- Einlesen einer ganzen Zahl n von der Tastatur; dabei Wiederholung der Eingabe, solange n kleiner als 1 ist.
- Feststellen, wie viele Ziffern die Binärdarstellung von n hat.

> Beispiele: Für n=27 hat die Binärdarstellung 11011 fünf Ziffern, für n=92 hat die Binärdarstellung 1011100 sieben Ziffern.Beispiele: Für n=27 hat die Binärdarstellung 11011 fünf Ziffern, für n=92 hat die Binärdarstellung 1011100 sieben Ziffern.

> *Vorgehensweise*: 
Sie müssen die Binärdarstellung von n nicht explizit ermitteln. **Programmieren Sie stattdessen eine Schleife, in der n wiederholt ganzzahlig durch 2 geteilt wird,  bis es zu 0 wird. **
Zählen Sie dabei in einer *Zählvariablen*, wie oft die Schleife durchlaufen wird.

- &rarr; Das Resultat auf den Bildschirm ausgeben.

Das Struktogramm muss so detailliert sein, dass in ihm alle Schleifen und Verzweigungen des späteren Programms zu erkennen sind. Bitte beachten Sie dazu auch das Video zur systematischen Erstellung eines Struktogramms, das Sie in Ilias finden.

Sie können das Struktogramm entweder mit einem Software-Werkzeug erstellen, oder Sie können es per Hand auf ein Blatt Papier zeichnen, das Sie dann einscannen oder fotografieren. In jedem Fall müssen Sie eine PDF-, JPG- oder PNG-Datei erzeugen; andere Formate werden nicht akzeptiert. Benennen Sie die Datei mit Aufgabe_2A_2.xxx, wobei xxx für das Dateiformat (pdf, jpg, png) steht.

Schreiben Sie danach ein Java-Programm in einer Datei `Aufgabe_2A_2.java`, das Ihrem
Struktogramm genau entspricht.

 ## Aufgabe_2A_3: Kontrollstrukturen
Das Programm in dieser Aufgabe soll ein** Dreieck aus Sternen mit n Zeilen** ausgeben, wobei* in der i-ten Zeile i Sterne stehen*. n soll beliebig gewählt werden können:
```
*
**
***
****
```
usw., bis n Zeilen erreicht sind.

Stellen Sie zuerst ein **Struktogramm** für einen entsprechenden Algorithmus auf:
- Zunächst soll eine ganze Zahl n eingelesen werden. 
- Der Einlesevorgang soll wiederholt werden, bis n größer als 3 ist.
- Anschließend sollen zwei geschachtelte Schleifen ausgeführt werden. 
- - Der Laufindex i für die äußere Schleife entspricht den Zeilen des Dreiecks und läuft daher von 1 bis n; 
- - der Laufindex für die innere Schleife entspricht den Spalten in der jeweiligen Zeile und läuft daher jeweils von 1 bis i. 
- - - Im Körper der inneren Schleife wird jeweils ein einzelner Stern ausgegeben.

> Das Struktogramm muss so detailliert sein, dass in ihm alle Schleifen des späteren Programms zu erkennen sind. 

> Außerdem wichtig: Es muss deutlich werden, wo ein “*Zeilenvorschub*” stattfindet, d.h. wo zum Beginn einer neuen Zeile umgeschaltet wird.Außerdem wichtig: Es muss deutlich werden, wo ein “*Zeilenvorschub*” stattfindet, d.h. wo zum Beginn einer neuen Zeile umgeschaltet wird.

Erstellen Sie eine Datei `Aufgabe_2A_3.xxx` wie in der vorherigen Aufgabe, auch hier wieder als `PDF`-, `JPG`- oder `PNG`-Datei.

Setzen Sie danach das Struktogramm in ein Java-Programm `Aufgabe_2A_3.java` um. Auch
hier soll das Programm dem Struktogramm genau entsprechen.