package br.senac.service;

import br.senac.model.Livros;
import br.senac.repository.LivrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LivrosService {

    @Autowired
    LivrosRepositorio livrosRepositorio;


    public List<Livros> getAllLivros (){
        List<Livros> livros = new ArrayList<Livros>();
        livrosRepositorio.findAll().forEach(livros1 -> livros.add(livros1));
        return livros;
    }

    public Livros getLivrosById (int id){
        return livrosRepositorio.findById(id).get();
    }

    public void addLivros(Livros livro){
        livrosRepositorio.save(livro);
    }

    public void updateLivros (Livros livro, int id){
        livrosRepositorio.save (livro);
    }

    public void deleteLivros(int id){
        livrosRepositorio.deleteById(id);
    }

}
