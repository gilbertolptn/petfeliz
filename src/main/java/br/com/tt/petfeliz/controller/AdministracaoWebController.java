package br.com.tt.petfeliz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Não com REST, mas com Páginas HTML
public class AdministracaoWebController {

    @GetMapping({"/admin/", "/admin"})
    public String getPaginaInicial(Model page){
        page.addAttribute("nomeAplicacao", "Pet Feliz");
        return "admin"; // admin.html
    }
}
