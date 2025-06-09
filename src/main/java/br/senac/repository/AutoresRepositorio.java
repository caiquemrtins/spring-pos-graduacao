package br.senac.repository;

import br.senac.model.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoresRepositorio extends JpaRepository<Autores, Integer> {

}
