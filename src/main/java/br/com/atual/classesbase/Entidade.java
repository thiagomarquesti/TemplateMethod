package br.com.atual.classesbase;

/**
 * Created by Ton on 04/03/2015.
 */
public abstract class Entidade {

    private Integer id;

    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
