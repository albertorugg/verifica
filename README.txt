----------------------------------------------------------------------------------
******** File README del progetto ********   
----------------------------------------------------------------------------------

La cartella contiene due file:
- Veicolo.java
- Registro.java

La classe Veicolo descrive un veicolo, ha quattro attributi private:

- Categoria (Autoveicolo o Motoveicolo) String
- Marca String
- Modello String
- Cilindrata int

completare la classe definendo il costruttore, i metodi di accesso agli attributi e il metodo toString() che restituisce in un'unica stringa le infomazioni sul veicolo.

La classe Registro descrive un elenco di veicoli, memorizzati in una Lista. Contiene un solo attributo:

- registro LinkedList<Veicolo>

La classe espone un metodo carica() che legge i dati da memorizzare nella lista da un file di testo (Veicoli.txt). Il metodo è già definito e non va modificato.
Completare con i seguenti metodi:

- stampa(), che produce la stampa delle informazioni di ciascun veicolo registrato;
- stampa(String cat), che produce la stampa delle informazioni di ciascun veicolo appartenente alla categoria passata come parametro;
- stampaOrdinata(), che produce la stampa ordinata per Marca delle informazioni di ciascun veicolo registrato;

Scrivere, infine, una classe Main he contenga il solo metodo main() e che, dopo aver istanziato un oggetto Registro e averlo caricato con i dati contenuti nel file Veicoli.txt, produca:

1 - la stampa di tutti i veicoli presenti nel registro;
2 - la stampa di tutti gli Autoveicoli presenti nel registro;
3 - la stampa ordinata di tutti i veicoli presenti nel registro.

