package br.com.tt.petfeliz.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InformacoesRepository {

    public List<String> listarTelefones(){
        List<String> telefones = new ArrayList<>();
        telefones.add("51 9090-9090");
        telefones.add("51 9090-8080");
        telefones.add("51 9090-8585");
        return telefones;
    }

    public List<String> listarEnderecos() {
        return List.of(
                "Rua Assis Brasil, 876",
                "Rua Sertorio, 8543",
                "Rua Borges de Medeiros, 54");
    }
}
