public class Moto extends Veiculo{

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto esta acelerando...");
    }
}
