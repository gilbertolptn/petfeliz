package br.com.tt.petfeliz.service;

import br.com.tt.petfeliz.model.Telefone;
import br.com.tt.petfeliz.repository.TelefoneRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class TelefoneService {

    private TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    public List<Telefone> getTelefones(){
//        Telefone telefone = new Telefone(null, "4234234324");
//        Telefone telefone2 = new Telefone(null, "55542342323");
//
//        telefoneRepository.save(telefone);
//        telefoneRepository.save(telefone2);
//
//        telefoneRepository.deleteById(1L);

        List<Telefone> telefones = telefoneRepository.findAll();

//        for(Telefone i : telefones){
//            System.out.println(i);
//        }

        return telefones;
    }

    public void criarTelefone(Telefone telefone) {
        telefoneRepository.save(telefone);
    }
}
