package org.example.entities;

import org.apache.tomcat.websocket.ClientEndpointHolder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long endereco;

    @Column(length = 100, name = "LOGRADOURO", nullable = false)
    private String logradouro;

    @Column(length = 10, name = "NUMERO", nullable = false)
    private String numero;

    @Column(length = 100, name = "COMPLEMENTO")
    private String complemento;

    @Column(length = 50, name = "BAIRRO")
    private String bairro;

    @Column(length = 25, name = "CIDADE", nullable = false)
    private String cidade;

    @Column(length = 2, name = "ESTADO", nullable = false)
    private String estado;

    @Column(length = 9, name = "CEP", nullable = false)
    private String cep;


    public Endereco() {
    }


    public Endereco(Long endereco, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.endereco = endereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Long getEndereco() {
        return endereco;
    }

    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
