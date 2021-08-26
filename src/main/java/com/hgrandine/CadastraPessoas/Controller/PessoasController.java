package com.hgrandine.CadastraPessoas.Controller;


import com.hgrandine.CadastraPessoas.Dto.PeopleDto;
import com.hgrandine.CadastraPessoas.Service.PeopleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PessoasController {

    @PostMapping("/register")
    public void savePeople(@RequestBody PeopleDto people){
        PeopleService.save(people);
    }

}
