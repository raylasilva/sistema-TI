package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsuarioController {

    private List<ChamadosModel> chamados = new ArrayList<>();

    @GetMapping("/login-usuario")
    public String loginUsuario() {
        return "login-usuario";
    }

    @PostMapping("/login-usuario")
    public String loginUsuario(@RequestParam String name, Model model) {
        model.addAttribute("name", name);

        return "redirect:/chamados-sistema?name=" + name;
    }
}