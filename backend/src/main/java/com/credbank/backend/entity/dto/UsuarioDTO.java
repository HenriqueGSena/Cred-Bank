package com.credbank.backend.entity.dto;

import com.credbank.backend.entity.enuns.Role;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String senha;
    private Role role;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nome, String senha, Role role) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.role = role;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
