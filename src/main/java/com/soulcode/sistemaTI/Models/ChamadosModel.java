package com.soulcode.sistemaTI.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class ChamadosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idtecnico;
    @Column
    private String nome;
    @Column
    private String setor;
    @Column
    private String descricao;
    @Column

    private String prioridade;
    @Column
    private LocalDate dataInicio;

    public ChamadosModel() {
    }

    public ChamadosModel(String nome, String setor, String descricao, String prioridade, LocalDate dataInicio) {
        this.setor = setor;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataInicio = dataInicio;
        this.nome = nome;
    }

    public long getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(long idtecnico) {
        this.idtecnico = idtecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdTecnico() {
        return idtecnico;
    }

    public void setIdTecnico(long idtecnico) {
        this.idtecnico = idtecnico;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}