package com.example.eavola.Repository;

import com.example.eavola.Model.Linea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LineaRepository extends CrudRepository<Linea, Long> {

    @NonNull
    @Query(value = "SELECT * FROM Linee L WHERE L.Nome = :nome;", nativeQuery = true)
    Linea getLineaByNome(@Param("nome") String nome);

}