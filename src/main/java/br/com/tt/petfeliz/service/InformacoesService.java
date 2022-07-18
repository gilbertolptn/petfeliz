package br.com.tt.petfeliz.service;

import br.com.tt.petfeliz.repository.InformacoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacoesService {

    private InformacoesRepository informacoesRepository;

    public InformacoesService(InformacoesRepository informacoesRepository) {
        this.informacoesRepository = informacoesRepository;
    }

    public List<String> listarTelefones(){
        return informacoesRepository.listarTelefones();
    }

    public List<String> listarEnderecos() {
       return informacoesRepository.listarEnderecos();
    }

    public List<String> listarHorarios() {
        return informacoesRepository.listarHorarios();
    }

    public void cadastrarTelefone(String numero) {
        informacoesRepository.cadastrarTelefone(numero);
    }
}
