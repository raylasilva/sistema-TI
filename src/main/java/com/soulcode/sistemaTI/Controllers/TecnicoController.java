package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import com.soulcode.sistemaTI.Models.TecnicoModels;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TecnicoController {


    private String nomeCompletoTecnico;
    @GetMapping("/login-tecnico")
    public String loginTecnico() {
        return "login-tecnico";
    }
//    @RequestMapping(value = "/historicotecnico",method = RequestMethod.POST)
//    public String loginTecnico(@RequestParam String name, Model model) {
//        model.addAttribute("name", name);
//        return "chamados-tecnicos";
//    }
    @PostMapping("/login-tecnico")
    public String loginUsuario(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        nomeCompletoTecnico = name;
        return "redirect:/historicochamado?name=" + nomeCompletoTecnico;
    }




}


