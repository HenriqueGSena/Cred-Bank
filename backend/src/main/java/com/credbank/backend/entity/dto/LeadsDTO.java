package com.credbank.backend.entity.dto;

import java.time.LocalDateTime;

public class LeadsDTO {

    private Long id;
    private String uuid;
    private String nome;
    private String uf;
    private String cpf;
    private String ag;
    private String cc;
    private String tel1;
    private String tel2;
    private String tel3;
    private String tel4;
    private String cargo;
    private String nomeEmpregador;
    private String cdc;
    private String consig;
    private LocalDateTime dataNascimento;
    public LeadsDTO() {
    }

    public LeadsDTO(Long id, String uuid, String nome, String uf, String cpf, String ag, String cc, String tel1, String tel2, String tel3, String tel4, String cargo, String nomeEmpregador, String cdc, String consig, LocalDateTime dataNascimento) {
        this.id = id;
        this.uuid = uuid;
        this.nome = nome;
        this.uf = uf;
        this.cpf = cpf;
        this.ag = ag;
        this.cc = cc;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.tel3 = tel3;
        this.tel4 = tel4;
        this.cargo = cargo;
        this.nomeEmpregador = nomeEmpregador;
        this.cdc = cdc;
        this.consig = consig;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getTel4() {
        return tel4;
    }

    public void setTel4(String tel4) {
        this.tel4 = tel4;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public void setNomeEmpregador(String nomeEmpregador) {
        this.nomeEmpregador = nomeEmpregador;
    }

    public String getCdc() {
        return cdc;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public String getConsig() {
        return consig;
    }

    public void setConsig(String consig) {
        this.consig = consig;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
