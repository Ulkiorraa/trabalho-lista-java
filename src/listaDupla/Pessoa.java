package listaDupla;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private int idade;
    private String telefone;

    // METODOS
   public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.telefone = "";
    }

    public Pessoa(String n, int i, String t) {
        this.nome = n;
        this.idade = i;
        this.telefone = t;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String PessoaToString(){
        return "Nome: " + getNome() + "\tIdade: " + getIdade() + "\tTelefone: " + getTelefone() + "\n";
    }
}