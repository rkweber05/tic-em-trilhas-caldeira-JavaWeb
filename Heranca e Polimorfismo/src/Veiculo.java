public abstract class Veiculo {
    String modelo;
    int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void colocarGasolina(){
        System.out.println(modelo + " está colocando gasolina");
    }

    public void pintarCarro(){
        System.out.println(modelo + " está pintando o carro");
    }

    public abstract void acelerar();
}
