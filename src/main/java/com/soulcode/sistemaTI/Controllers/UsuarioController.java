package com.soulcode.sistemaTI.Controllers;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsuarioController {

    @RequestMapping(value = "/login-usuario", method = RequestMethod.GET)
    public String loginUsuario() {
        return "login-usuario";
    }

   @RequestMapping(value = "/login-usuario", method = RequestMethod.POST)
    public String loginUsuario(@RequestParam String name, Model model) {
        model.addAttribute( "name", name);

        return "redirect:/chamados-sistema?name=" + name;
    }
}