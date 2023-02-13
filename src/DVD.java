public class DVD extends Prodotto {
    private String titolo;
    private String categoria;
    private double peso;
    private double costo;
    private double durata;

    public DVD(String titolo, String categoria, double peso, double costo, double durata){
        this.titolo = titolo;
        this.categoria = categoria;
        this.peso = peso;
        this.costo = costo;
        this.durata = durata;
    }

    public DVD(){

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
    public double getCosto() {
        return costo;
    }

    @Override
    public String getNome() {
        return titolo;
    }

    public double getDurata() {
        return durata;
    }
}
