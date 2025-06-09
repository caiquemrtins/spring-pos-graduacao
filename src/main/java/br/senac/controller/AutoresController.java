package br.senac.controller;


import br.senac.model.Autores;
import br.senac.service.AutoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutoresController {

    @Autowired
    AutoresService AutoresService;

    @GetMapping("/autores")
    private List<Autores> getAllAutores() {
        return AutoresService.getAllAutores();
    }


    @GetMapping("/autores/{id}")
    private Autores getAutoresById(@PathVariable("id") int id) {
        return AutoresService.getAutoresById(id);
    }

    @PostMapping("/autores")
    private int addAutores(@RequestBody Autores Autores) {
        AutoresService.addAutores(Autores);
        return Autores.getId();
    }

    @PutMapping("/autores/{id}")
    private ResponseEntity<String> updateAutores(@PathVariable("id") int id, @RequestBody Autores Autores) {
        AutoresService.updateAutores(Autores, id);
        return ResponseEntity.ok("Atualizado com Sucesso");
    }

    @DeleteMapping("/autores/{id}")
    private ResponseEntity<String> deleteAutores(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Valor incorreto para deleção.");
        } else {
            AutoresService.deleteAutores(id);
            return ResponseEntity.ok("Excluído com Sucesso");
        }
    }

}
