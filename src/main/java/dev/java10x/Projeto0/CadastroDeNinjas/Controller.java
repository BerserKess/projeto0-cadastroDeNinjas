package dev.java10x.Projeto0.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    /*
    * GetMapping: ANOTAÇÃO QUE PEGA INFORMAÇÕES E TODO MUNDO QUE ACESSAR A ROTA VAI TER ACESSO
    * */
    @GetMapping("/boasvindas") // VAI INFORMAR A MENSAGEM ABAIXO
    public String boasVindas(){
        return "Primeira mensagem da rota";
    }
}
