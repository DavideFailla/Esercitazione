import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

public class Negozio {
    public static ArrayList<Prodotti> merce = new ArrayList<>();
    public static ArrayList<RacchettaDaPadel> racchetteSpeciali = new ArrayList();

    public static void main(String[] args) {


        Libro l1 = new Libro("1234567891234", "L'amore proibito", "Romanzo", 250.00, 13.50, 700);
        add(l1);
        Libro l2 = new Libro("1234567895678", "Il cavallo robot", "Fantasy", 150.00, 15.00, 450);
        add(l2);
        Libro l3 = new Libro("1234567899123", "Nuovi vicini", "Fantasy", 180.00, 20.00, 550);
        add(l3);
        DVD d1 = new DVD("Hell", "Horror", 40.00, 25.00, 1.5);
        add(d1);
        DVD d2 = new DVD("Heaven", "Romantico", 35.00, 22.50, 2.0);
        add(d2);
        DVD d3 = new DVD("Chi ha ucciso il programmatore", "Thriller", 35.00, 22.50, 2.0);
        add(d3);
        RacchettaDaPadel r1 = new RacchettaDaPadel("HEAD", 350.0, 120.00, "A Goccia");
        add(r1);
        RacchettaDaPadel r2 = new RacchettaDaPadel("KUIKMA", 380.0, 40.00, "Rotonda");
        add(r2);
        RacchettaDaPadel r3 = new RacchettaDaPadel("BULLPADEL", 360.0, 109.99, "A Diamante");
        add(r3);
        RacchettaDaPadel r4 = new RacchettaDaPadel("VIBORA", 355.0, 429.50, "A Goccia");
        add(r4);
        RacchettaDaPadel r5 = new RacchettaDaPadel("VARLION", 340.0, 65.00, "A Goccia");
        add(r5);
        RacchettaDaPadel r6 = new RacchettaDaPadel("BABOLAT", 345.0, 220.00, "A Goccia");
        add(r6);

        //funzione per contare il numero di prodotti in negozio
        countProdotti();

        //funzione per visualizzare il peso totale dei prodotti in negozio
        countPeso();

        //funzione per visualizzare l'oggetto più costoso del negozio
        oggPiuCostoso();

        //funzione che aggiunge un nuovo prodotto al negozio
        aggProdotto();

        //funzione per visualizzare il numero di libri fantasy presenti in negozio
        quantiFantasy();

        //funzione per un ArrayList con dentro tutte le racchette A Goccia che costano più di 100 euro
        nuovoArrayRacchette();

    }

    public static void add(Prodotti d) {
        merce.add(d);
    }

    public static void countProdotti() {
        System.out.println("Ci sono " + merce.size() + " prodotti");
    }

    public static void countPeso() {
        double pesoTot = 0;
        for (Prodotti p : merce) {
            pesoTot += p.getPeso();
        }
        System.out.println("Il peso totale di tutti i prodotti al momento presenti in negozio è " + pesoTot + " grammi");
    }

    public static void oggPiuCostoso() {
        String oggetto = new String();
        double piuCostoso = 0;
        for(Prodotti p : merce){
            if(p.getCosto() > piuCostoso){
                piuCostoso = p.getCosto();
                oggetto = p.getNome();
            }
        }
        System.out.println("Il prodotto più costoso all'interno del negozio è " + oggetto + " e costa ben " + piuCostoso + " euro!");
    }

    public static void quantiFantasy(){
        int count = 0;
        for(Prodotti p : merce){
            if(p instanceof Libro){
                Libro l = (Libro)p;
                if(l.getCategoria().equalsIgnoreCase("Fantasy")){
                    count++;
                }
            }
        }
        System.out.println("Ci sono "+ count + " libri nella categoria Fantasy");
    }

    public static void nuovoArrayRacchette(){
        int count = 0;
        for (Prodotti p : merce){
            if(p instanceof RacchettaDaPadel) {
                RacchettaDaPadel r = (RacchettaDaPadel) p;
                if (r.getCosto() > 100 && r.getTipo().equalsIgnoreCase("A Goccia")) {
                    racchetteSpeciali.add(r);
                    count++;
                }
            }
        }
        System.out.println("Abbiamo " + count + " Racchette A Goccia che costano più di 100 euro");
        for (RacchettaDaPadel r : racchetteSpeciali){
            System.out.println(r.getNome() + " del valore di " + r.getCosto() + "euro");
    }   }

    public static void aggProdotto(){
        Scanner console = new Scanner(System.in);
        System.out.println("Quale oggetto vuoi creare? Puoi scegliere tra Libro, DVD e Racchetta da padel");
        String s = console.nextLine();
        if(s.equalsIgnoreCase("Libro")){
            System.out.println("Ok aggiungiamo un libro! Per prima cosa mi serve l'ISBN");
            String i = console.nextLine();
            System.out.println("Adesso dimmi il titolo");
            String t = console.nextLine();
            System.out.println("Molto bene! Adesso dimmi la categoria");
            String c = console.nextLine();
            System.out.println("Perfetto! Quanti grammi pesa?");
            double p = console.nextDouble();
            System.out.println("Ultime due cose: costo?");
            double m = console.nextDouble();
            System.out.println("Numero di Pagine?");
            int f = console.nextInt();
            Libro l = new Libro(i, t, c, p, m, f);
            add(l);
            System.out.println("Grazie mille della tua pazienza! Ho aggiunto il libro");
        }else if(s.equalsIgnoreCase("DVD")){
            System.out.println("Ok aggiungiamo un DVD! Per prima cosa mi serve il titolo");
            String t = console.nextLine();
            System.out.println("Adesso la categoria");
            String c = console.nextLine();
            System.out.println("Quanti grammi pesa?");
            double p = console.nextDouble();
            System.out.println("Perfetto! Adesso dammi il costo");
            double m = console.nextDouble();
            System.out.println("Quante ore dura?");
            double d = console.nextDouble();
            System.out.println("E DVD sia!");
            DVD k = new DVD(t, c, p, m, d);
            add(k);
        }else if(s.equalsIgnoreCase("Racchetta da padel") || s.equalsIgnoreCase("Racchetta") || s.equalsIgnoreCase("Padelpa")){
            System.out.println("E via con la racchetta! Che marca è?");
            String m = console.nextLine();
            System.out.println("Perfetto! Adesso mi serve il peso in grammi");
            double p = console.nextDouble();
            System.out.println("Quanto costa?");
            double c = console.nextDouble();
            System.out.println("Che tipo è? Puoi scegliere tra Rotonda, A Goccia e A Diamante");
            String t = console.nextLine();
            System.out.println("Perfetto abbiamo tutto! Vado a metterla in negozio");
            RacchettaDaPadel r = new RacchettaDaPadel(m, p, c, t);
            add(r);
        }else{
            System.out.println("Sbagliato!");
        }
    }
}