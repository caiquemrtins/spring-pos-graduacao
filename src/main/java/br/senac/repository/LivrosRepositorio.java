package br.senac.repository;

import br.senac.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepositorio extends JpaRepository<Livros, Integer> {

}
