package com.fag.lucasmartins.arquitetura_software.core.domain.bo;

import com.fag.lucasmartins.arquitetura_software.core.domain.exceptions.DomainException;

public class PessoaBO {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private int idade;


    public void ValidaNome() {
        if (this.nome == null || this.nome.isBlank()) {
            throw new DomainException("Nome não pode ser nulo");
        }
    }

    public void ValidadeCPF() {
        if (this.cpf == null || this.cpf.length() != 11) {
            throw new DomainException("CPF deve ter 11 caracteres");
        }
    }

    public void ValidadeTelefone() {
        if (this.telefone == null || this.telefone.length() != 11) {
            throw new DomainException("Telefone deve ter 11 caracteres");
        }
    }

    public void ValidaEmail() {
        if (this.email == null || !this.email.contains("@")) {
            throw new DomainException("Email inválido");
        }
    }

    public void ValidaIdade() {
        if (this.idade < 18) {
            throw new DomainException("Cadastro deve ser maior de 18 anos");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

        public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
