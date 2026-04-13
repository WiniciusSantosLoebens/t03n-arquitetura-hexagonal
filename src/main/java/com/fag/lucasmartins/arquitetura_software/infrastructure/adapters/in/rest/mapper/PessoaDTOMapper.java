package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;

public class PessoaDTOMapper {

    private PessoaDTOMapper() {
    }

    public static PessoaBO toBo(PessoaDTO dto) {
        final PessoaBO bo = new PessoaBO();
        bo.setNome(dto.getNome());
        bo.setCPF(dto.getCPF());
        bo.setTelefone(dto.getTelefone());
        bo.setEmail(dto.getEmail());
        bo.setIdade(dto.getIdade());

        return bo;
    }

    public static PessoaDTO toDto(PessoaBO bo) {
        final PessoaDTO dto = new PessoaDTO();
        dto.setNome(bo.getNome());
        dto.setCPF(bo.getCPF());
        dto.setTelefone(bo.getTelefone());
        dto.setEmail(bo.getEmail());
        dto.setIdade(bo.getIdade());

        return dto;
    }

}