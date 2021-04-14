package sdtp1;

import java.util.Objects;

public class livro {

    private String nome, editora, genero, autor;
    private int id, ano, edicao;
    private float precoCompra, precoVenda;
    private boolean disponivel;
    
    
    public livro() {
        
    }

    public livro(int id, String nome,String genero, String editora, String autor, int ano, int edicao, float precoCompra, float precoVenda) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.editora = editora;
        this.autor = autor;
        this.ano = ano;
        this.edicao = edicao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.disponivel = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float preco) {
        this.precoCompra = preco;
    }
    
    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float preco) {
        this.precoVenda = preco;
    }

    @Override
    public String toString() {
        return "livro{" +"id="+ id + ", nome=" + nome + ", genero=" + genero + ", editora=" + editora + ", autor=" + autor + ", ano=" + ano + ", edicao=" + edicao + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda +'}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final livro other = (livro) obj;
        
        if(this.id != other.id){
            return false;
        }
        
        if (this.ano != other.ano) {
            return false;
        }
        if (this.edicao != other.edicao) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        if (Float.floatToIntBits(this.precoCompra) != Float.floatToIntBits(other.precoCompra)) {
            return false;
        }
        if (Float.floatToIntBits(this.precoVenda) != Float.floatToIntBits(other.precoVenda)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.editora, other.editora)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }





    
}
