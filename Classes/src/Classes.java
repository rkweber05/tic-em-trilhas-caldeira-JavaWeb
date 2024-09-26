import entities.Carro;

public class Classes {
    public static void main(String[] args) {
        Carro carro = new Carro("Corolla", "Toyota", 2024);

        carro.acelerar();
        carro.desacelerar();
        carro.parar();
    }
}
