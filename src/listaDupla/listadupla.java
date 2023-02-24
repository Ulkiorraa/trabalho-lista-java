package listaDupla;

import java.util.ArrayList;


public class listadupla {
    // ATRIBUTOS
    private ArrayList<Pessoa> listaPessoa;

    // MÉTODOS

    public listadupla(){
        this.listaPessoa = new ArrayList<Pessoa>();
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
        listaPessoa.forEach((i)->System.out.println(i.PessoaToString()));
    }
}
