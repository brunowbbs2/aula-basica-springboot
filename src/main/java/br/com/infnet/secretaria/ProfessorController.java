package br.com.infnet.secretaria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController //Annottation para falar que isso é um controller
@RequestMapping("/professores") // Annotation para registar a rota de alunos
public class ProfessorController {

    @GetMapping
    public ArrayList<String> listarProfessores(){

        //IR LA NO BANCO, MONTAR O JSON E RETORNO


        ArrayList<String> prof = new ArrayList<>();
        prof.add("Prof1");
        prof.add("Prof2");
        prof.add("Prof3");

        return prof;
    }

    @PostMapping
    public String cadastrarProfessor(){

        //IMPLEMENTACAO


        return "METODO PARA CADASTRAR PROFESSOR FOI CHAMADO!";
    }
}
