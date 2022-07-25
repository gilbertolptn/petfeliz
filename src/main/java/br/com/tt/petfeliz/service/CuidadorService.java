package br.com.tt.petfeliz.service;

import br.com.tt.petfeliz.model.Cuidador;
import br.com.tt.petfeliz.repository.CuidadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {

    private CuidadorRepository cuidadorRepository;

    public CuidadorService(CuidadorRepository cuidadorRepository) {
        this.cuidadorRepository = cuidadorRepository;
    }

    public List<Cuidador> getCuidadores(){
        return cuidadorRepository.findAll();

//        Raca raca = new Raca(null, "Linguiça", TipoAnimal.CAO, null);
//
//        Cuidador cuidador = new Cuidador(null, "Gilberto", "12312312345",
//                "51 9999 8888", "Porto Alegre", Estado.RS, TipoCuidador.INICIANTE,
//                new ArrayList<>());
//
//        cuidadorRepository.save(cuidador);
//
//        Cuidador gilberto = cuidadorRepository.getById(1L);
//        gilberto.adicionarRaca(new Raca(null, "Gato SRD", TipoAnimal.GATO, null));
//        cuidadorRepository.save(gilberto);
    }
}
