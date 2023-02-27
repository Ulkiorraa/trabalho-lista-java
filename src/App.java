import java.util.Scanner;

import listaDupla.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        listadupla amigos = new listadupla();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar pessoa.");
            System.out.println("2 - remover pessoa.");
            System.out.println("3 - Sair");
            
            int opcao = ler.nextInt();
            ler.nextLine();
            
            switch (opcao) {
                case 1:
                    amigos.adicionarPessoa(ler, amigos);
                    break;
                
                case 2:
                System.out.println("Que pessoa desseja remover?");
                amigos.removerPessoa(ler);
                break;

                case 3:
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
}