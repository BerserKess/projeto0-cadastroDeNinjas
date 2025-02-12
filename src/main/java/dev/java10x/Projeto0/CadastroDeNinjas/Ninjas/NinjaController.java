package dev.java10x.Projeto0.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    /*
    * GetMapping: ANOTAÇÃO QUE PEGA INFORMAÇÕES E TODO MUNDO QUE ACESSAR A ROTA VAI TER ACESSO
    * */
    @GetMapping("/boasvindas") // VAI INFORMAR A MENSAGEM ABAIXO
    public String boasVindas(){ return "Primeira mensagem da rota"; }

        // CRUD
        // ADICIONAR NINJA (CREATE)
        @PostMapping("/criar")
        public String criarNinja(){ return "Ninja Criado"; }

        // MOSTRAR TODOS OS NINJAS (READ)
        @GetMapping("/listar")
        public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
        }

        // MOSTRAR NINJA POR ID (READ)
        @GetMapping("/listarID")
        public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por ID";
        }

        // ALTERAR DADOS DOS NINJAS (UPDATE)
        @PutMapping("/alterar")
        public String alterarNinjaPorId(){
            return "Ninja Alterado";
        }

        // DELETAR NINJAS (DELETE)
        @DeleteMapping("/deletar")
        public String deletarNinja(){
            return "Ninja deletado";
        }
}
