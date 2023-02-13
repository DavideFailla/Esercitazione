import java.util.ArrayList;
import java.util.Scanner;

public class Magazzino {
    private ArrayList<Prodotto> lista = new ArrayList<>();

    public void add(Prodotto p){
        lista.add(p);
    }

    public int countProdotti() {
        return lista.size();
    }

    public void countPeso() {
        double pesoTot = 0;
        for (Prodotto p : lista) {
            pesoTot += p.getPeso();
        }
        System.out.println("Il peso totale di tutti i prodotti al momento presenti in negozio è " + pesoTot + " grammi");
    }

    public Prodotto oggPiuCostoso() {
        Prodotto mostExpensive = null;
        //double piuCostoso = 0;
        for(Prodotto p : lista){
            if(mostExpensive == null || p.getCosto() > mostExpensive.getCosto()){
                //piuCostoso = p.getCosto();
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }

    public void quantiFantasy(){
        int count = 0;
        for(Prodotto p : lista){
            if(p instanceof Libro){
                Libro l = (Libro)p;
                if(l.getCategoria().equalsIgnoreCase("Fantasy")){
                    count++;
                }
            }
        }
        System.out.println("Ci sono "+ count + " libri nella categoria Fantasy");
    }

    public ArrayList<RacchettaDaPadel> nuovoArrayRacchette() {
        ArrayList<RacchettaDaPadel> racchetteSpeciali = new ArrayList();
        for (Prodotto p : lista) {
            if (p instanceof RacchettaDaPadel) {
                RacchettaDaPadel r = (RacchettaDaPadel) p;
                if (r.getCosto() > 100 && r.getTipo().equalsIgnoreCase("A Goccia")) {
                    racchetteSpeciali.add(r);
                }
            }
        }
        return racchetteSpeciali;
    }
    public void aggProdotto(){
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
