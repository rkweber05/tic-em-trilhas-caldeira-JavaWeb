public class Carro extends Veiculo{

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro está acelerando...");
    }
}
