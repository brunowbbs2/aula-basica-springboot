package br.com.infnet.secretaria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController //Annottation para falar que isso é um controller
@RequestMapping("/alunos") // Annotation para registar a rota de alunos
public class AlunoController {

    @GetMapping
    public ArrayList<String> listarAlunos(){

        //IR LA NO BANCO, MONTAR O JSON E RETORNO


        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Wesley");
        alunos.add("Ana");
        alunos.add("Maria");

        return alunos;
    }
}
