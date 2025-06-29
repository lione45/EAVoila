package com.example.eavola.Repository;

import com.example.eavola.Model.Treno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrenoRepository extends CrudRepository<Treno, Integer> {

    @NonNull
    @Query(value = "SELECT * FROM Treni T WHERE T.Modello = :modello AND T.id_linea = :linea;", nativeQuery = true)
    Optional<List<Treno>> getTrenoByModelloAndLinea(@Param("modello") String modello, @Param("linea") Integer linea);

}