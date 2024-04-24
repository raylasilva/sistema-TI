package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChamadosController {

    private List<ChamadosModel> chamados = new ArrayList<>();
    private String nomeCompletoUsuario;

    @GetMapping("/chamados-usuario")
    public String listaChamadosUsuario(Model model, String name) {
        model.addAttribute("chamados", chamados);
        model.addAttribute("name", name);
        return "chamados-usuario";
    }

    @RequestMapping(value = "/criar-chamado", method = RequestMethod.GET)
    public String criarChamado(Model model, String name ) {
        model.addAttribute("name", name);
        model.addAttribute("chamado", chamados);
        return "novo-chamado";
    }
    @RequestMapping(value = "/mostrar-chamado", method = RequestMethod.GET)
 public String criarNovoChamado(ChamadosModel chamado, Model model, @RequestParam String nome,String setor,String descricao, String prioridade) {
        model.addAttribute("name", nome);
      ChamadosModel novoChamado = new ChamadosModel(nome, setor, descricao, prioridade);
        model.addAttribute("chamado", novoChamado);
        chamados.add(chamado);

            // Adicionar o objeto ao modelo para ser exibido na página de confirmação

        return "novoChamados" ;
  }


}