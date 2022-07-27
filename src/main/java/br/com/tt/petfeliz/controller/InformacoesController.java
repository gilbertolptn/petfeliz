package br.com.tt.petfeliz.controller;

import br.com.tt.petfeliz.service.InformacoesService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@OpenAPIDefinition(info = @Info(title = "PET FELIZ API"))
@Tag(name = "Informações")
@RestController // Por padrão Singleton - 1 instância criada no startup
//@SessionScope // Muda de Singleton para um Bean que nasce e morre a cada usuário
public class InformacoesController {

    private InformacoesService informacoesService;

    public InformacoesController(InformacoesService informacoesService){
         this.informacoesService = informacoesService;
    }

    @GetMapping("/telefones")
    @Operation(description = "Lista os telefones ativos do PetFeliz")
    public List<String> listarTelefones(){
        return informacoesService.listarTelefones();
    }

    @GetMapping("/enderecos")
    public List<String> listarEnderecos(){
        return informacoesService.listarEnderecos();
    }

    @GetMapping("/horarios")
    public List<String> listarHorarios(){
        return informacoesService.listarHorarios();
    }

}
