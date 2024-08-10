package com.credbank.backend.entity.enuns;

public enum Role {

    ADMIN("admin"),
    GERENTE("gerente"),
    FUNCIONARIO("functionario");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
