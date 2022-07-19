package br.com.tt.petfeliz.controller;

import br.com.tt.petfeliz.controller.request.TelefoneCriacaoRequest;
import br.com.tt.petfeliz.service.InformacoesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //Não com REST, mas com Páginas HTML
@RequestMapping("/admin")
public class AdministracaoWebController {

    private InformacoesService informacoesService;

    public AdministracaoWebController(InformacoesService informacoesService) {
        this.informacoesService = informacoesService;
    }

    @GetMapping
    public String getPaginaInicial(Model page){
        page.addAttribute("nomeAplicacao", "Pet Feliz");
        return "admin"; // admin.html
    }

    @GetMapping("/telefone-cadastrar")
    public String getPaginaTelefoneCadastrar(){
        return "telefone-cadastrar";
    }

    @PostMapping("/action/telefone-cadastrar")
    public String actionTelefoneCadastrar(TelefoneCriacaoRequest telefone){
        informacoesService.cadastrarTelefone(telefone.getNumero());
        return "redirect:/admin/telefone-cadastrar";
    }

//    @PostMapping("/action/tefonone-cadastrar")
//    public void actionTelefoneCadastrar(@RequestParam Map atributos){
//        System.out.println(atributos);
//    }

    @GetMapping("/telefone-listar")
    public String getPaginaTelefoneListar(Model page){
        List<String> telefones = informacoesService.listarTelefones();
        page.addAttribute("telefones", telefones);

        return "telefone-listar";
    }


}

