package listaDupla;

import java.util.ArrayList;
import java.util.Scanner;


public class listadupla {
    // ATRIBUTOS
    private ArrayList<Pessoa> listaPessoa;

    // MÉTODOS

    public listadupla(){
        this.listaPessoa = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(Scanner ler, listadupla amigos) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o nome da Pessoa.");
        pessoa.setNome(ler.nextLine());
        System.out.println("Digite a idade da pessoa.");
        pessoa.setIdade(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite o telefone da pessoa.");
        pessoa.setTelefone(ler.nextLine());
        System.out.println("Deseja colocar os dados em cima ou em baixo da lista?");
        System.out.println("1 - Adicionar ao começo da lista");
        System.out.println("2 - Adicionar ao final da lista");
        int opcao = ler.nextInt();
        ler.nextLine();
        
        while (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida! Digite novamente:");
            opcao = ler.nextInt();
            ler.nextLine();
        }
        
        if (opcao == 1) {
            amigos.addBegin(pessoa);
        } else {
            amigos.addEnd(pessoa);
        }
    }

    public void removerPessoa(Scanner ler) {
        String nome = ler.nextLine();
        Pessoa pessoaRemover = null;
        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getNome().equals(nome)) {
                pessoaRemover = pessoa;
                break;
            }
        }
        if (pessoaRemover != null) {
            listaPessoa.remove(pessoaRemover);
            System.out.println("Pessoa " + nome + " removida da lista.");
        } else {
            System.out.println("Pessoa " + nome + " não encontrada na lista.");
        }
    }

    public void addEnd(Pessoa ficha){
        if (listaPessoa.contains(ficha)) {
            System.out.println("Dados já contidos na lista.");
            return;
        }
        listaPessoa.add(ficha);
        System.out.println("Dados adicionados no fim da lista!");
    }
    
    public void addBegin(Pessoa ficha){
        if (listaPessoa.contains(ficha)) {
            System.out.println("Dados já contidos na lista.");
            return;
        }
        listaPessoa.add(0, ficha);
        System.out.println("Dados adicionados no começo da lista!");
    }

    public void printList(){
        listaPessoa.forEach(System.out::println);
    }
}
