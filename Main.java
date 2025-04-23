public class Main {
    public static void main(String[] args) {
        PessoaFactory fabrica = new PessoaFactory();
        Pessoa pessoa1 = fabrica.criaPessoa("nome", 22);
        Pessoa pessoa2 = fabrica.criaPessoa("nome", 33);
        Pessoa pessoa3 = fabrica.criaPessoa("nome", 44);

        System.out.println("Pessoa 1 ID: " + pessoa1.getId());
        System.out.println("Pessoa 2 ID: " + pessoa2.getId());
        System.out.println("Pessoa 3 ID: " + pessoa3.getId());
    }
}
