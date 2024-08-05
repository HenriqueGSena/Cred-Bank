package com.credbank.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "leads")
@Entity(name = "leads")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Leads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "nome")
    private String nome;

    @Column(name = "uf")
    private String uf;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "ag")
    private String ag;

    @Column(name = "cc")
    private String cc;

    @Column(name = "tel1")
    private String tel1;

    @Column(name = "tel2")
    private String tel2;

    @Column(name = "tel3")
    private String tel3;

    @Column(name = "tel4")
    private String tel4;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "nomeEmpregador")
    private String nomeEmpregador;

    @Column(name = "cdc")
    private String cdc;

    @Column(name = "consig")
    private String consig;

    @Column(name = "dataNascimento")
    private LocalDateTime dataNascimento;
}
