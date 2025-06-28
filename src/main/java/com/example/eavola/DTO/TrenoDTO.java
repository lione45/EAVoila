package com.example.eavola.DTO;

import java.util.Objects;

public class TrenoDTO {

    private Long id;
    private String modello;
    private Integer capacita;
    private Long idLinea;

    public TrenoDTO() {
    }

    public TrenoDTO(Long id, String modello, Integer capacita, Long idLinea) {
        this.id = id;
        this.modello = modello;
        this.capacita = capacita;
        this.idLinea = idLinea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getCapacita() {
        return capacita;
    }

    public void setCapacita(Integer capacita) {
        this.capacita = capacita;
    }

    public Long getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(Long idLinea) {
        this.idLinea = idLinea;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TrenoDTO trenoDTO = (TrenoDTO) o;
        return Objects.equals(id, trenoDTO.id) && Objects.equals(modello, trenoDTO.modello) && Objects.equals(capacita, trenoDTO.capacita) && Objects.equals(idLinea, trenoDTO.idLinea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modello, capacita, idLinea);
    }

    @Override
    public String toString() {
        return "TrenoDTO{" +
                "id=" + id +
                ", modello='" + modello + '\'' +
                ", capacita=" + capacita +
                ", idLinea=" + idLinea +
                '}';
    }
}
