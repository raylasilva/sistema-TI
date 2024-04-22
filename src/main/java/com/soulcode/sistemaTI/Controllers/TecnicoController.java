package com.soulcode.sistemaTI.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TecnicoController {
    @GetMapping("/login-tecnico")
    public String loginTecnico() {
        return "login-tecnico";
    }

}
