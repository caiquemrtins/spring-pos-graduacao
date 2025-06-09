package br.senac.controller;


import br.senac.model.Livros;
import br.senac.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivrosController {

    @Autowired
    LivrosService livrosService;

    @GetMapping("/livros")
    private List<Livros> getAllLivros() {
        return livrosService.getAllLivros();
    }


    @GetMapping("/livros/{id}")
    private Livros getLivrosById(@PathVariable("id") int id) {
        return livrosService.getLivrosById(id);
    }

    @PostMapping("/livros")
    private int addLivros(@RequestBody Livros livros) {
        livrosService.addLivros(livros);
        return livros.getId();
    }

    @PutMapping("/livros/{id}")
    private ResponseEntity<String> updateLivros(@PathVariable("id") int id, @RequestBody Livros livros) {
        livrosService.updateLivros(livros, id);
        return ResponseEntity.ok("Atualizado com Sucesso");
    }

    @DeleteMapping("livros/{id}")
    private ResponseEntity<String> deleteLivros(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Valor incorreto para deleção.");
        } else {
            livrosService.deleteLivros(id);
            return ResponseEntity.ok("Excluído com Sucesso");
        }
    }

}
