public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Godofredo", 8);
        cachorro.mostrarNome();
        cachorro.mostrarIdade();
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("-----------------------------------------");

        Gato gato = new Gato("José", 9);
        gato.mostrarNome();
        gato.mostrarIdade();
        gato.comer();
        gato.dormir();
        gato.miado();

        System.out.println("-------------------------------------------");
        Veiculo carro = new Carro("Ferrari", 2024);
        Veiculo moto = new Moto("CB1000", 2026);

        carro.colocarGasolina();
        carro.acelerar();

        moto.colocarGasolina();
        moto.acelerar();
    }
}
