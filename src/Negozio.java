import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
    public static void main(String[] args) {
        Magazzino m = new Magazzino();

        Libro l1 = new Libro("1234567891234", "L'amore proibito", "Romanzo", 250.00, 13.50, 700);
        m.add(l1);
        Libro l2 = new Libro("1234567895678", "Il cavallo robot", "Fantasy", 150.00, 15.00, 450);
        m.add(l2);
        Libro l3 = new Libro("1234567899123", "Nuovi vicini", "Fantasy", 180.00, 20.00, 550);
        m.add(l3);
        DVD d1 = new DVD("Hell", "Horror", 40.00, 25.00, 1.5);
        m.add(d1);
        DVD d2 = new DVD("Heaven", "Romantico", 35.00, 22.50, 2.0);
        m.add(d2);
        DVD d3 = new DVD("Chi ha ucciso il programmatore", "Thriller", 35.00, 22.50, 2.0);
        m.add(d3);
        RacchettaDaPadel r1 = new RacchettaDaPadel("HEAD", 350.0, 120.00, "A Goccia");
        m.add(r1);
        RacchettaDaPadel r2 = new RacchettaDaPadel("KUIKMA", 380.0, 40.00, "Rotonda");
        m.add(r2);
        RacchettaDaPadel r3 = new RacchettaDaPadel("BULLPADEL", 360.0, 109.99, "A Diamante");
        m.add(r3);
        RacchettaDaPadel r4 = new RacchettaDaPadel("VIBORA", 355.0, 429.50, "A Goccia");
        m.add(r4);
        RacchettaDaPadel r5 = new RacchettaDaPadel("VARLION", 340.0, 65.00, "A Goccia");
        m.add(r5);
        RacchettaDaPadel r6 = new RacchettaDaPadel("BABOLAT", 345.0, 220.00, "A Goccia");
        m.add(r6);

        //funzione per contare il numero di prodotti in negozio
        int numProduct = m.countProdotti();

        //funzione per visualizzare il peso totale dei prodotti in negozio
        m.countPeso();

        //funzione per visualizzare l'oggetto più costoso del negozio
        Prodotto p = m.oggPiuCostoso();

        //funzione che aggiunge un nuovo prodotto al negozio
        m.aggProdotto();

        //funzione per visualizzare il numero di libri fantasy presenti in negozio
        m.quantiFantasy();

        //funzione per un ArrayList con dentro tutte le racchette A Goccia che costano più di 100 euro
        ArrayList<RacchettaDaPadel> expensiveDrop = m.nuovoArrayRacchette();

    }
}