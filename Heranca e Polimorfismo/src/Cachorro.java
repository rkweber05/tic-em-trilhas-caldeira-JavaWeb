public class Cachorro extends AnimalDeEstimacao{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("au au au...");
    }

    public void latir(){
        System.out.println("au au au...");
    }
}
