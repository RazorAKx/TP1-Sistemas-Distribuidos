package sdtp1;

import java.util.ArrayList;

public class vendedor {
    private int id;
    private String nome, localizacao;
    private ArrayList<livro> arraylistlivros;   //livros em stock
    private ArrayList<venda> arraylistvendas;   //vendas feitas aos clientes
    

    //=========================================================== constructors =======================================================
    
    public vendedor() {
    }

    
    public vendedor(int id, String nome, String localizacao, ArrayList<livro> arraylistlivros) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.arraylistlivros = arraylistlivros;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public ArrayList<livro> getArraylistlivros() {
        return arraylistlivros;
    }

    public void setArraylistlivros(ArrayList<livro> arraylistlivros) {
        this.arraylistlivros = arraylistlivros;
    }

    
    //=========================================================== METODOS =======================================================

    public void consultarLivros (){
        //todos 
        //disponibilizar arraylistlivros;
    }
    
    public void consultarPorNome(){
        
    }
    
    public void consultarPorGenero(){
        
    }
    
    public void quantidadeLivro(){
        //verificar quantos objetos daquele tipo existem
    }
    
    public void listarVendas(){
        //2 OP????ES: por mais vendido ou por ordem de valor(pre??o);
       
    }
    
    public void consultarComprasFeitas(){
        //2 OP????ES: por ordem de valor(pre??o), ou mostrar tudo (p.ex.: por data ou id);
    }
    
    public void addLivro(){
        //incluide metodo: registarproduto
        //verifica se o objeto <livro> j?? existe => se existe adiciona QTD, se n??o existe cria novo
        //ir buscar ao fornecedor QTD do objeto <livro> e adicionar ?? arraylistlivros;
    }
    
    public void eliminarLivro(){
        //apagar objeto <livro> da arrayList
    }
     
    public void venderLivro (){
        //utilizar classe <venda> ?
        
        //ver se ele existe
        //eliminar objeto <livro> da arraylistlivros;
        //se a quantidade for == colocar com indisponivel;
    }
    
    
}
