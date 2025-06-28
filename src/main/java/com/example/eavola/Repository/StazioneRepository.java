package com.example.eavola.Repository;

import com.example.eavola.Model.Linea;
import com.example.eavola.Model.Stazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface StazioneRepository extends JpaRepository<Stazione, Long> {

    @NonNull
    @Query(value = "SELECT * FROM Stazioni S WHERE S.Nome = :nome;", nativeQuery = true)
    Stazione getStazioneByNome(@Param("nome") String nome);

}
