package br.com.tt.petfeliz.controller;

import br.com.tt.petfeliz.model.Telefone;
import br.com.tt.petfeliz.service.TelefoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TelefoneController {

    private TelefoneService telefoneService;

    public TelefoneController(TelefoneService telefoneService) {
        this.telefoneService = telefoneService;
    }

    @GetMapping("/api/telefones")
    public List<Telefone> getTelefones(){
        return telefoneService.getTelefones();
    }
}
