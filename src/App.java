import java.util.Scanner;

import listaDupla.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        listadupla amigos = new listadupla();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Sair");
            
            int opcao = ler.nextInt();
            ler.nextLine();
            
            switch (opcao) {
                case 1:
                    adicionarPessoa(ler, amigos);
                    break;

                case 2:
                    continuar = false;
                    System.out.println("Lista fechada!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        
        amigos.printList();
        ler.close();
    }
    
    public static void adicionarPessoa(Scanner ler, listadupla amigos) {
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
            System.out.println("Dados adicionados no começo da lista!");
        } else {
            amigos.addEnd(pessoa);
            System.out.println("Dados adicionados no fim da lista!");
        }
    }
}