package com.example.eavola.Model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Stazioni")
public class Stazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String citta;

    private Double latitudine;

    private Double longitudine;

    @Column(name = "attrazioni_turistiche", columnDefinition = "TEXT")
    private String attrazioniTuristiche;

    @OneToMany(mappedBy = "stazione", cascade = CascadeType.ALL)
    private List<Fermata> fermate;

    public Stazione() { }

    public Stazione(Integer id, String nome, String citta, Double latitudine, Double longitudine, String attrazioniTuristiche, List<Fermata> fermate) {
        this.id = id;
        this.nome = nome;
        this.citta = citta;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.attrazioniTuristiche = attrazioniTuristiche;
        this.fermate = fermate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
    }

    public Double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
    }

    public String getAttrazioniTuristiche() {
        return attrazioniTuristiche;
    }

    public void setAttrazioniTuristiche(String attrazioniTuristiche) {
        this.attrazioniTuristiche = attrazioniTuristiche;
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
        Stazione stazione = (Stazione) o;
        return Objects.equals(id, stazione.id) && Objects.equals(nome, stazione.nome) && Objects.equals(citta, stazione.citta) && Objects.equals(latitudine, stazione.latitudine) && Objects.equals(longitudine, stazione.longitudine) && Objects.equals(attrazioniTuristiche, stazione.attrazioniTuristiche) && Objects.equals(fermate, stazione.fermate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, citta, latitudine, longitudine, attrazioniTuristiche, fermate);
    }

    @Override
    public String toString() {
        return "Stazione{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", latitudine=" + latitudine +
                ", longitudine=" + longitudine +
                ", attrazioniTuristiche='" + attrazioniTuristiche + '\'' +
                ", fermate=" + fermate +
                '}';
    }
}
