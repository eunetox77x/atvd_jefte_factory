public class PessoaFactory {
    private int contador = 0;

    public Pessoa criaPessoa(String nome, int idade) {
        Pessoa pessoa = new Pessoa(contador, nome, idade);
        contador++;
        return pessoa;
    }
}
