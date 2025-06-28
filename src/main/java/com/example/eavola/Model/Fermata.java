package com.example.eavola.Model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "Fermate")
public class Fermata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_treno")
    private Treno treno;

    @ManyToOne
    @JoinColumn(name = "id_stazione")
    private Stazione stazione;

    private LocalTime orarioArrivo;

    private LocalTime orarioPartenza;

    private Integer ritardoMinuti;

    public Fermata() {
    }

    public Fermata(Integer id, Treno treno, Stazione stazione, LocalTime orarioArrivo, LocalTime orarioPartenza, Integer ritardoMinuti) {
        this.id = id;
        this.treno = treno;
        this.stazione = stazione;
        this.orarioArrivo = orarioArrivo;
        this.orarioPartenza = orarioPartenza;
        this.ritardoMinuti = ritardoMinuti;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Treno getTreno() {
        return treno;
    }

    public void setTreno(Treno treno) {
        this.treno = treno;
    }

    public Stazione getStazione() {
        return stazione;
    }

    public void setStazione(Stazione stazione) {
        this.stazione = stazione;
    }

    public LocalTime getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(LocalTime orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public LocalTime getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(LocalTime orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public Integer getRitardoMinuti() {
        return ritardoMinuti;
    }

    public void setRitardoMinuti(Integer ritardoMinuti) {
        this.ritardoMinuti = ritardoMinuti;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fermata fermata = (Fermata) o;
        return Objects.equals(id, fermata.id) && Objects.equals(treno, fermata.treno) && Objects.equals(stazione, fermata.stazione) && Objects.equals(orarioArrivo, fermata.orarioArrivo) && Objects.equals(orarioPartenza, fermata.orarioPartenza) && Objects.equals(ritardoMinuti, fermata.ritardoMinuti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treno, stazione, orarioArrivo, orarioPartenza, ritardoMinuti);
    }

    @Override
    public String toString() {
        return "Fermata{" +
                "id=" + id +
                ", treno=" + treno +
                ", stazione=" + stazione +
                ", orarioArrivo=" + orarioArrivo +
                ", orarioPartenza=" + orarioPartenza +
                ", ritardoMinuti=" + ritardoMinuti +
                '}';
    }
}