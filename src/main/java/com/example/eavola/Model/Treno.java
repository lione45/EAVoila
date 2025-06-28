package com.example.eavola.Model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Treni")
public class Treno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String modello;
    private Integer capacita;

    @ManyToOne
    @JoinColumn(name = "id_linea")
    private Linea linea;

    @OneToMany(mappedBy = "treno", cascade = CascadeType.ALL)
    private List<Fermata> fermate;

    public Treno() { }

    public Treno(Integer id, String modello, Integer capacita, Linea linea, List<Fermata> fermate) {
        this.id = id;
        this.modello = modello;
        this.capacita = capacita;
        this.linea = linea;
        this.fermate = fermate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    public List<Fermata> getFermate() {
        return fermate;
    }

    public void setFermate(List<Fermata> fermate) {
        this.fermate = fermate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Treno treno = (Treno) o;
        return Objects.equals(id, treno.id) && Objects.equals(modello, treno.modello) && Objects.equals(capacita, treno.capacita) && Objects.equals(linea, treno.linea) && Objects.equals(fermate, treno.fermate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modello, capacita, linea, fermate);
    }

    @Override
    public String toString() {
        return "Treno{" +
                "id=" + id +
                ", modello='" + modello + '\'' +
                ", capacita=" + capacita +
                ", linea=" + linea +
                ", fermate=" + fermate +
                '}';
    }

}
