package com.hgrandine.CadastraPessoas.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class PeopleDto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String cpf;

    @Getter @Setter
    private String address;

}
