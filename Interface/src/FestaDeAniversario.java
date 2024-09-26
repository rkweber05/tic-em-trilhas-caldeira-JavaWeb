public class FestaDeAniversario implements Tarefas{
    @Override
    public void decorar() {
        System.out.println("Comprar balões");
        System.out.println("Colocar fitas");
    }

    @Override
    public void chamarConvidados() {
        System.out.println("Chamar João");
        System.out.println("Chamar Maria");
    }

    @Override
    public void comprarComida() {
        System.out.println("Comprar pizza");
        System.out.println("Comprar refrigerante");
    }
}
