package entities;

public class Carro {
    private String modleo;
    private String marca;
    private int anoDeFabricacao;

    public Carro(String modelo, String marca, int anoDeFabricacao) {
        this.modleo = modelo;
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void acelerar() {}
    public void desacelerar(){}
    public void parar(){}
}
