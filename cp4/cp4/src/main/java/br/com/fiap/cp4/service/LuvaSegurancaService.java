package br.com.fiap.cp4.service;


import br.com.fiap.cp4.dto.LuvaSeguranca.LuvaSegurancaDto;
import br.com.fiap.cp4.model.entities.LuvaSeguranca;
import br.com.fiap.cp4.repository.LuvaSegurancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LuvaSegurancaService {

    @Autowired
    private LuvaSegurancaRepository luvaSegurancaRepository;

    public LuvaSeguranca save(LuvaSegurancaDto dto) {

        return luvaSegurancaRepository.save(dto);
    }




}
