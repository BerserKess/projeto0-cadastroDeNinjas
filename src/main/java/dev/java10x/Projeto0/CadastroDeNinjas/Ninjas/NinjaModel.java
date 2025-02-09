package dev.java10x.Projeto0.CadastroDeNinjas.Ninjas;

import dev.java10x.Projeto0.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// ENTITY: TRANSFORMA UMA CLASSE EM UMA ENTIDADE DO BANCO DE DADOS
// PRECISA DA DEPENDENCIA DO JPA
@Entity
@Table(name = "tb_cadastro") // boa pratica o nome ser em snake case
@Data
@NoArgsConstructor
@AllArgsConstructor
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


}
