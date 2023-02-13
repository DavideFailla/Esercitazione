public class RacchettaDaPadel extends Prodotto {
    private String marca;
    private double peso;
    private double costo;
    private String tipo;

    public RacchettaDaPadel(String marca, double peso, double costo, String tipo){
        this.marca = marca;
        this.peso = peso;
        this.costo = costo;
        this.tipo = tipo;
    }

    public RacchettaDaPadel(){

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
        return marca;
    }

    public String getTipo() {
        return tipo;
    }
}
