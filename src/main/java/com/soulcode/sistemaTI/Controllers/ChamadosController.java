package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/criar-chamado")
    public String criarChamado(Model model) {
        model.addAttribute("usuario", "");
        return "novo-chamado";
    }

    @PostMapping("/criar-chamado")
    public String criarNovoChamado(ChamadosModel chamado) {
        chamados.add(chamado);
        return "redirect:/chamados-usuario?name=" + chamado.getUsuario();
    }
}