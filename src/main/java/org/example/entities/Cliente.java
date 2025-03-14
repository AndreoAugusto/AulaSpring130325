package org.example.entities;

import org.springframework.data.convert.ThreeTenBackPortConverters;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable {


    //Atributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(length = 55, name = "NOME_CLIENTE", nullable = false)
    private String nome;

    @Column(length = 15, name = "CPF", nullable = false)
    private String cpf;

    @Column(length = 10, name = "DATA_NASCIMENTO")
    private String data_nascimeto;

    @Column(length = 50, name = "FORMA_PAGAMENTO", nullable = false)
    private String forma_pagamento;


    //Constructor Empty
    public Cliente() {
    }


    //Arguments Constructor
    public Cliente(Long id, String nome, String cpf, String data_nascimeto, String forma_pagamento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimeto = data_nascimeto;
        this.forma_pagamento = forma_pagamento;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimeto() {
        return data_nascimeto;
    }

    public void setData_nascimeto(String data_nascimeto) {
        this.data_nascimeto = data_nascimeto;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
}
