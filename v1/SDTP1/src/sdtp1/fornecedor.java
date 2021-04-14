package sdtp1;

import java.util.ArrayList;

public class fornecedor {
    private int id;
    private String nome;
    private ArrayList<livro> arraylistLivros;   //livros em stock
    private ArrayList<venda> arraylistVendas;   //vendas feitas aos vendedores;

//=========================================================== constructors =======================================================
    
    public fornecedor() {
    }

    public fornecedor(int id, String nome, ArrayList<livro> arraylistLivros, ArrayList<venda> arraylistVendas) {
        this.id = id;
        this.nome = nome;
        this.arraylistLivros = arraylistLivros;
        this.arraylistVendas = arraylistVendas;
    }

    
//=========================================================== getters & setters =======================================================
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<livro> getArraylistLivros() {
        return arraylistLivros;
    }

    public void setArraylistLivros(ArrayList<livro> arraylistLivros) {
        this.arraylistLivros = arraylistLivros;
    }

    public ArrayList<venda> getArraylistVendas() {
        return arraylistVendas;
    }

    public void setArraylistVendas(ArrayList<venda> arraylistVendas) {
        this.arraylistVendas = arraylistVendas;
    }
    

//=========================================================== METODOS =======================================================

    public void registarLivro(){
        //Adicionar <livro> ao arraylist;
    }

    public void removerLivro(){
        //retirar da arraylist;

    }
    
    public void consultarVendas(){
        
    }
}