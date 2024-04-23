package com.soulcode.sistemaTI.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TecnicoController {
    private String nomeCompletoTecnico;
    @GetMapping("/login-tecnico")
    public String loginTecnico() {
        return "login-tecnico";
    }
    @RequestMapping(value = "/historicotecnico",method = RequestMethod.POST)
    public String loginTecnico(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "chamados-tecnicos";
    }

}


