package dev.java10x.Projeto0.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
        @GetMapping("/todos")
        public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
        }

        // MOSTRAR NINJA POR ID (READ)
        @GetMapping("/todosPorID")
        public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por ID";
        }

        // ALTERAR DADOS DOS NINJAS (UPDATE)
        @PutMapping("/alterarNinja")
        public String alterarNinjaPorId(){
            return "Ninja Alterado";
        }

        // DELETAR NINJAS (DELETE)
        @DeleteMapping("/DeletarNinja")
        public String deletarNinja(){
            return "Ninja deletado";
        }
}
