package dev.java10x.Projeto0.CadastroDeNinjas.Missoes;

import dev.java10x.Projeto0.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tv_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char dificuldade;

    @OneToMany(mappedBy = "missoes") // UMA MISSÃO PODE TER VÁRIOS NINJAS
    // mappedBy - vai fazer a conexão entre as tabelas
    private List<NinjaModel> ninjas;

}
