package dev.java10x.Projeto0.CadastroDeNinjas;

import jakarta.persistence.*;

// ENTITY: TRANSFORMA UMA CLASSE EM UMA ENTIDADE DO BANCO DE DADOS
// PRECISA DA DEPENDENCIA DO JPA
@Entity
@Table(name = "tb_cadastro") // boa pratica o nome ser em snake case
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // passa uma estratégia de como vai ser gerado o Id
    private Long id;
    private String nome;
    private String cla;
    private char rank;
    private String email;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String cla, char rank, String email) {
        this.nome = nome;
        this.cla = cla;
        this.rank = rank;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
