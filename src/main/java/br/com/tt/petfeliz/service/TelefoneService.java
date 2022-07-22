package br.com.tt.petfeliz.service;

import br.com.tt.petfeliz.model.Telefone;
import br.com.tt.petfeliz.repository.TelefoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {

    private TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    public List<Telefone> getTelefones(String ddd){

        if(ddd == null || ddd.isBlank()){
            return telefoneRepository.findAll();

        }else{

            return telefoneRepository.findAllByDdd(ddd);
        }
    }

    public void criarTelefone(Telefone telefone) {
        telefoneRepository.save(telefone);
    }
}
