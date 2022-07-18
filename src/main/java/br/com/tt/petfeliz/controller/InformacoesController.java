package br.com.tt.petfeliz.controller;

import br.com.tt.petfeliz.service.InformacoesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Por padrão Singleton - 1 instância criada no startup
//@SessionScope // Muda de Singleton para um Bean que nasce e morre a cada usuário
public class InformacoesController {

    private InformacoesService informacoesService;

    public InformacoesController(InformacoesService informacoesService){
         this.informacoesService = informacoesService;
    }

    @RequestMapping("/telefones")
    public List<String> listarTelefones(){
        return informacoesService.listarTelefones();
    }

    @RequestMapping("/enderecos")
    public List<String> listarEnderecos(){
        return informacoesService.listarEnderecos();
    }

    @RequestMapping("/horarios")
    public List<String> listarHorarios(){
        return informacoesService.listarHorarios();
    }

}
