package br.com.tt.petfeliz.repository;

import br.com.tt.petfeliz.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Opcional quando estendemos o JpaRepository, CrudRepository, Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
