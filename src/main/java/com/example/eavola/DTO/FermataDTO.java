package com.example.eavola.DTO;

import java.time.LocalTime;
import java.util.Objects;

public class FermataDTO {

    private Long id;
    private Long idTreno;
    private Long idStazione;
    private LocalTime orarioArrivo;
    private LocalTime orarioPartenza;
    private Integer ritardoMinuti;

    public FermataDTO() {
    }

    public FermataDTO(Long id, Long idTreno, Long idStazione, LocalTime orarioArrivo, LocalTime orarioPartenza, Integer ritardoMinuti) {
        this.id = id;
        this.idTreno = idTreno;
        this.idStazione = idStazione;
        this.orarioArrivo = orarioArrivo;
        this.orarioPartenza = orarioPartenza;
        this.ritardoMinuti = ritardoMinuti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTreno() {
        return idTreno;
    }

    public void setIdTreno(Long idTreno) {
        this.idTreno = idTreno;
    }

    public Long getIdStazione() {
        return idStazione;
    }

    public void setIdStazione(Long idStazione) {
        this.idStazione = idStazione;
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
        FermataDTO that = (FermataDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(idTreno, that.idTreno) && Objects.equals(idStazione, that.idStazione) && Objects.equals(orarioArrivo, that.orarioArrivo) && Objects.equals(orarioPartenza, that.orarioPartenza) && Objects.equals(ritardoMinuti, that.ritardoMinuti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idTreno, idStazione, orarioArrivo, orarioPartenza, ritardoMinuti);
    }

    @Override
    public String toString() {
        return "FermataDTO{" +
                "id=" + id +
                ", idTreno=" + idTreno +
                ", idStazione=" + idStazione +
                ", orarioArrivo=" + orarioArrivo +
                ", orarioPartenza=" + orarioPartenza +
                ", ritardoMinuti=" + ritardoMinuti +
                '}';
    }
}
