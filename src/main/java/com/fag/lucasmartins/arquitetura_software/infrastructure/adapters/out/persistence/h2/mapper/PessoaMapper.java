package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.mapper;

import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;

public class PessoaMapper {

    private PessoaMapper() {
    }

    public static PessoaEntity toEntity(PessoaBO pessoaBO) {
        PessoaEntity pessoaEntity = new PessoaEntity();
        pessoaEntity.setNome(pessoaBO.getNome());
        pessoaEntity.setCPF(pessoaBO.getCPF());
        pessoaEntity.setTelefone(pessoaBO.getTelefone());
        pessoaEntity.setEmail(pessoaBO.getEmail());
        pessoaEntity.setIdade(pessoaBO.getIdade());

        return pessoaEntity;
    }

    public static PessoaBO toBO(PessoaEntity pessoaEntity) {
        PessoaBO pessoaBO = new PessoaBO();
        pessoaBO.setNome(pessoaEntity.getNome());
        pessoaBO.setCPF(pessoaEntity.getCPF());
        pessoaBO.setTelefone(pessoaEntity.getTelefone());
        pessoaBO.setEmail(pessoaEntity.getEmail());
        pessoaBO.setIdade(pessoaEntity.getIdade());

        return pessoaBO;
    }
}
