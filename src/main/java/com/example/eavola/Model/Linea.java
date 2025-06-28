package com.example.eavola.Model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Linee")
public class Linea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String tipo;

    @OneToMany(mappedBy = "linea", cascade = CascadeType.ALL)
    private List<Treno> treni;

    public Linea() { }

    public Linea(Integer id, String nome, String tipo, List<Treno> treni) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.treni = treni;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Treno> getTreni() {
        return treni;
    }

    public void setTreni(List<Treno> treni) {
        this.treni = treni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Linea linea = (Linea) o;
        return Objects.equals(id, linea.id) && Objects.equals(nome, linea.nome) && Objects.equals(tipo, linea.tipo) && Objects.equals(treni, linea.treni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, tipo, treni);
    }

    @Override
    public String toString() {
        return "Linea{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", treni=" + treni +
                '}';
    }
}