package com.soulcode.sistemaTI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SistemaController {
    @GetMapping("/sistema-TI")
    public String SistemaTI(){
        return "index.html";
    }
   @GetMapping("/login-usuario")
   public String LoginUsuario(){
        return "login-usuario";
   }
    @GetMapping("/login-tecnico")
    public String LoginTecnico(){
        return "login-tecnico";
    }


}
