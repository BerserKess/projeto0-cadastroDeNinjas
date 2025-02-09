package dev.java10x.Projeto0.CadastroDeNinjas.Ninjas;

import dev.java10x.Projeto0.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// ENTITY: TRANSFORMA UMA CLASSE EM UMA ENTIDADE DO BANCO DE DADOS
// PRECISA DA DEPENDENCIA DO JPA
@Entity
@Table(name = "tb_cadastro") // boa pratica o nome ser em snake case
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // passa uma estratégia de como vai ser gerado o Id
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne // NINJAS PODEM TER UMA UNICA MISSAO
    @JoinColumn(name = "missoes_id") // Chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
