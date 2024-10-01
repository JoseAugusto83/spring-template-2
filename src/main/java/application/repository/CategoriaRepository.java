package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import application.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public Categoria findByNome(String nome);
}
