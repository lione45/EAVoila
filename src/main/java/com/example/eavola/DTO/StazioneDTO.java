package com.example.eavola.DTO;

import java.util.Objects;

public class StazioneDTO {

    private Long id;
    private String nome;
    private String citta;
    private Double latitudine;
    private Double longitudine;
    private String attrazioniTuristiche;

    public StazioneDTO() {
    }

    public StazioneDTO(Long id, String nome, String citta, Double latitudine, Double longitudine, String attrazioniTuristiche) {
        this.id = id;
        this.nome = nome;
        this.citta = citta;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.attrazioniTuristiche = attrazioniTuristiche;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StazioneDTO that = (StazioneDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(citta, that.citta) && Objects.equals(latitudine, that.latitudine) && Objects.equals(longitudine, that.longitudine) && Objects.equals(attrazioniTuristiche, that.attrazioniTuristiche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, citta, latitudine, longitudine, attrazioniTuristiche);
    }

    @Override
    public String toString() {
        return "StazioneDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", latitudine=" + latitudine +
                ", longitudine=" + longitudine +
                ", attrazioniTuristiche='" + attrazioniTuristiche + '\'' +
                '}';
    }
}