package com.soulcode.sistemaTI.Models;

import jakarta.persistence.*;

@Entity
public class TecnicoModels {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_tecnico;


//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_chamado")
//    private ChamadosModel id_chamado;
}
