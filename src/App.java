import java.util.Scanner;

import listaDupla.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        listadupla amigos = new listadupla();
        for(int i=0;i<5;i++){
            Pessoa x = new Pessoa("Jorge" + i, Math.min(10, 100), "6458545658" + i);
            if(i == 3){
                amigos.addBegin(x);
                continue;
            }
            amigos.addEnd(x);
        }
        char x;
        do {
            System.out.println("Deseja adicionar uma pessoa a lista? S/N");
            x = Character.toLowerCase(ler.next().charAt(0));
            ler.nextLine();
            switch (x) {
                case 's':
                    Pessoa pessoa = new Pessoa();
                    System.out.println("Digite o nome da Pessoa.");
                    pessoa.setNome(ler.nextLine());
                    System.out.println("Digite a idade da pessoa.");
                    pessoa.setIdade(ler.nextInt());
                    ler.nextLine();
                    System.out.println("Digite o telefone da pessoa.");
                    pessoa.setTelefone(ler.nextLine());
                    amigos.addEnd(pessoa);
                    break;

                case 'n':
                    System.out.println("Lista fechada!");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (x != 'n');
        amigos.printList();
        ler.close();
    }
}
