public abstract class AnimalDeEstimacao {
    String nome;
    int idade;

    public AnimalDeEstimacao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer(){
        System.out.println(nome + " está dormindo");
    }

    public void dormir(){
        System.out.println(nome + " está dormindo");
    }

    public void mostrarNome(){
        System.out.println(nome);
    }

    public void mostrarIdade(){
        System.out.println(idade);
    }

    public abstract void emitirSom();
}
