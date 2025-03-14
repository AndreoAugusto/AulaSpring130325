package org.example.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaPag implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FormaPag")
    private Long id_FormaPag;

    @Column(length = 55, name = "TIPO_FormaPag", nullable = false)
    private String tipo_FormaPag;

    @Column(length = 255, name = "DESCRICAO")
    private String descricao;


    //Empty Constructor

    public FormaPag() {
    }


    //Arguments Constructor

    public FormaPag(Long id_FormaPag, String tipo_FormaPag, String descricao) {
        this.id_FormaPag = id_FormaPag;
        this.tipo_FormaPag = tipo_FormaPag;
        this.descricao = descricao;
    }


    //Getters and Setters

    public Long getId_FormaPag() {
        return id_FormaPag;
    }

    public void setId_FormaPag(Long id_FormaPag) {
        this.id_FormaPag = id_FormaPag;
    }

    public String getTipo_FormaPag() {
        return tipo_FormaPag;
    }

    public void setTipo_FormaPag(String tipo_FormaPag) {
        this.tipo_FormaPag = tipo_FormaPag;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
