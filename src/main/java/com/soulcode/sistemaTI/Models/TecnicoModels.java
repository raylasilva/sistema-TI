package com.soulcode.sistemaTI.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TecnicoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTecnico;
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
    @Column
    private String obsevacao;
    @Column
    private String status;

    public TecnicoModels() {
    }

    public TecnicoModels(String nome, String setor, String descricao, String prioridade, LocalDate dataInicio, String obsevacao, String status) {
        this.nome = nome;
        this.setor = setor;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataInicio = dataInicio;
        this.obsevacao = obsevacao;
        this.status = status;
    }

    public long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getObsevacao() {
        return obsevacao;
    }

    public void setObsevacao(String obsevacao) {
        this.obsevacao = obsevacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
