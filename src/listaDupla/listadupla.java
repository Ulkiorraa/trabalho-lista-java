package listaDupla;

import java.util.ArrayList;

public class listadupla {
    // ATRIBUTOS
    private ArrayList<Pessoa> listaPessoa;

    // METODO

    public listadupla(){
        this.listaPessoa = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getListaPessoa() {
        return this.listaPessoa;
    }

    private void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public void addEnd(Pessoa ficha){
        ArrayList<Pessoa> aux = getListaPessoa();
        aux.add(ficha);
        setListaPessoa(aux);
    }

    public void addBegin(Pessoa ficha){
        ArrayList<Pessoa> aux = getListaPessoa();
        aux.add(0, ficha);
        setListaPessoa(aux);
    }

    public void printList(){
        getListaPessoa().forEach((i)->System.out.println(i.PessoaToString()));
    }
}
