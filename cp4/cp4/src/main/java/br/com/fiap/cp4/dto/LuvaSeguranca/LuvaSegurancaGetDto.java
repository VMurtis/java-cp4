package br.com.fiap.cp4.dto.LuvaSeguranca;

import br.com.fiap.cp4.model.entities.LuvaSeguranca;
import br.com.fiap.cp4.model.enums.TamanhoLuva;

import java.util.List;
public record LuvaSegurancaGetDto(

        Long id,
        String marca

        //List<TamanhoLuva> tamanho
) {
    public LuvaSegurancaGetDto(LuvaSeguranca luva){
        this(
                luva.getId(),
                luva.getMarca()

        );
    }
}
