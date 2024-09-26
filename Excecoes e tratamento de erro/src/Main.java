public class Main {
    public static void main(String[] args) {
        String primeiroNumeroEmTexto = "20";
        String segundoNumeroEmTexto = "0";

        try {
            int primeiroNumero = Integer.parseInt(primeiroNumeroEmTexto);
            int segundoNumero = Integer.parseInt(segundoNumeroEmTexto);

            if (segundoNumero == 0) {
                throw new RuntimeException("É impossível dividir um número por 0");
            }

            System.out.println("A divisão é: " + (primeiroNumero / segundoNumero));
        } catch (Exception exception) {
            System.out.println("Algo deu errado. A mensagem no sistem foi: " + exception.getMessage());
        }

        System.out.println("Está acontecendo depois do erro");
    }
}