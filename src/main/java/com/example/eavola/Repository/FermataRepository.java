package com.example.eavola.Repository;

import com.example.eavola.Model.Fermata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FermataRepository extends JpaRepository<Fermata, Long> {

}
