package br.senac.service;

import br.senac.model.Autores;
import br.senac.model.Autores;
import br.senac.repository.AutoresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AutoresService {

    @Autowired
    AutoresRepositorio autoresRepositorio;


    public List<Autores> getAllAutores() {
        List<Autores> autores = new ArrayList<Autores>();
        autoresRepositorio.findAll().forEach(autores1 -> autores.add(autores1));
        return autores;
    }

    public Autores getAutoresById(int id) {
        return autoresRepositorio.findById(id).get();
    }

    public void addAutores(Autores livro) {
        autoresRepositorio.save(livro);
    }

    public void updateAutores(Autores livro, int id) {
        autoresRepositorio.save(livro);
    }

    public void deleteAutores(int id) {
        autoresRepositorio.deleteById(id);
    }

}
