package com.hgrandine.CadastraPessoas.Service;

import com.hgrandine.CadastraPessoas.Dto.PeopleDto;
import com.hgrandine.CadastraPessoas.Repository.PeopleRepository;

public class PeopleService {

    private static PeopleRepository repository;

    public static void save(PeopleDto people) {
        if(people.getName().isEmpty()){
            throw new IllegalArgumentException("Name should not to be empty");
        }
        if(people.getCpf().length() != 11){
            throw new IllegalArgumentException("CPF incorrect");
        }
        repository.save(people);
    }
}
