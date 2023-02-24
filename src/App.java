import java.util.Scanner;

import listaDupla.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        listadupla amigos = new listadupla();
        char x;
        char i;
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
                    ler.nextLine();
                    System.out.println("Deseja colocar os dados no inicio ou no fim da lista? (C para adcionar no começo, F para adcionar no final.)");
                    i = Character.toLowerCase(ler.next().charAt(0));
                    ler.nextLine();
                    do{
                        switch(i){
                            case 'f':
                                System.out.println("Dados adcionados no fim da lista!");
                                amigos.addEnd(pessoa);
                                break;
                            
                            case 'c':
                                System.out.println("Dados adcionados no começo da lista!");
                                amigos.addBegin(pessoa);
                                break;
                            
                            default:
                                System.out.println("Opção invalida!");
                                break;
                        }
                    }while(i != 'c' && i != 'f' );
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
