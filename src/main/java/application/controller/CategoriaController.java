package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categoria;
import application.record.CategoriaDTO;
import application.repository.CategoriaRepository;
import application.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public Iterable<CategoriaDTO> get(){
        return categoriaService.findAll();
    }

    @PostMapping
    public CategoriaDTO post(@RequestBody CategoriaDTO categoria){
        return categoriaService.post(categoria);
    }

    @GetMapping("/{id}")
    public CategoriaDTO getOne(@PathVariable long id){
        return categoriaService.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        categoriaService.delete(id);
    }

    @PutMapping("/{id}")
    public CategoriaDTO update(@PathVariable long id, @RequestBody CategoriaDTO categoria){
        categoriaService.update(id, categoria);
    }
    
}
