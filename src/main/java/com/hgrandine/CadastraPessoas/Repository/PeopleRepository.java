package com.hgrandine.CadastraPessoas.Repository;

import com.hgrandine.CadastraPessoas.Dto.PeopleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  PeopleRepository extends JpaRepository<PeopleDto, Integer> {
}
