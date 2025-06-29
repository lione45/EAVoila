package com.example.eavola.Repository;

import com.example.eavola.Model.Linea;
import com.example.eavola.Model.Stazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StazioneRepository extends CrudRepository<Stazione, Long> {

    @NonNull
    @Query(value = "SELECT * FROM Stazioni WHERE Nome = :nome", nativeQuery = true)
    Optional<Stazione> getStazioneByNome(@Param("nome") String nome);

}
