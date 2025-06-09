package br.senac.model;


import jakarta.persistence.*;


@Entity
@Table
public class Autores {

    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nomeAutor;
    @Column
    private int idadeAutor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getIdadeAutor() {
        return idadeAutor;
    }

    public void setIdadeAutor(int idadeAutor) {
        this.idadeAutor = idadeAutor;
    }
}
