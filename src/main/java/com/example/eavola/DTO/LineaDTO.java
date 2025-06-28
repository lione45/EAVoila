package com.example.eavola.DTO;

import java.util.Objects;

public class LineaDTO {

    private Long id;
    private String nome;
    private String tipo;

    public LineaDTO() {
    }

    public LineaDTO(Long id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LineaDTO lineaDTO = (LineaDTO) o;
        return Objects.equals(id, lineaDTO.id) && Objects.equals(nome, lineaDTO.nome) && Objects.equals(tipo, lineaDTO.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, tipo);
    }

    @Override
    public String toString() {
        return "LineaDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}