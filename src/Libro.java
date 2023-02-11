public class Libro extends Prodotti {
    private String ISBN;
    private String titolo;
    private String categoria;
    private double peso;
    private double costo;
    private int pagine;

    public Libro(String ISBN, String titolo, String categoria, double peso, double costo, int pagine){
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.categoria = categoria;
        this.peso = peso;
        this.costo = costo;
        this.pagine = pagine;
    }

    public Libro(){

    }

    public String getISBN(){
        return ISBN;
    }

    public String getTitolo(){
        return titolo;
    }

    public String getCategoria(){
        return categoria;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getCosto(){
        return costo;
    }

    @Override
    public String getNome() {
        return titolo;
    }

    public int getPagine(){
        return pagine;
    }

}
