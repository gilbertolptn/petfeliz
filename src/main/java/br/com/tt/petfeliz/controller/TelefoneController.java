package br.com.tt.petfeliz.controller;

import br.com.tt.petfeliz.model.Telefone;
import br.com.tt.petfeliz.service.TelefoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TelefoneController {

    private TelefoneService telefoneService;

    public TelefoneController(TelefoneService telefoneService) {
        this.telefoneService = telefoneService;
    }

    @GetMapping("/api/telefones")
    //TODO Vamos trocar pra DTO quando falarmos de Rest
    public List<Telefone> getTelefones(@RequestParam(required = false) String ddd){
        return telefoneService.getTelefones(ddd);
    }

    @PostMapping("/api/telefones")
    //TODO Vamos trocar pra DTO quando falarmos de Rest
    public void criarTelefone(@RequestBody Telefone telefone){
        telefoneService.criarTelefone(telefone);
    }
}
