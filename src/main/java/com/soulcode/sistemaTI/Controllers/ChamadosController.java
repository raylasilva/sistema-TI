package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChamadosController {


    //pagina pra criar um novo chamado e mandar pra pagina 'mostrar-chamado'
    @RequestMapping(value = "/criar-chamado", method = RequestMethod.GET)
    public String criarChamado(Model model, String name ) {
        model.addAttribute("name", name);
        return "novo-chamado";
    }

    //Pega o campo 'chamado' do html e mostra os objetos criados no input na pagina "mostrar-chamado"
    @RequestMapping(value = "/mostrar-chamado", method = RequestMethod.GET)
 public String criarNovoChamado(Model model, @RequestParam String nome,String setor,String descricao, String prioridade) {
        model.addAttribute("name", nome);
      ChamadosModel novoChamado = new ChamadosModel(nome, setor, descricao, prioridade);
        model.addAttribute("chamado", novoChamado);


        return "mostrarNovoChamados" ;
  }


}