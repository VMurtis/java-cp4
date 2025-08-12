package br.com.fiap.cp4.model.entities;


import br.com.fiap.cp4.model.enums.TamanhoLuva;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // Gera getter, setter, toString, equals e hashCode
@NoArgsConstructor // Construtor vazio
@AllArgsConstructor

@Entity
@Table(name = "TAB_LUVA_SEURANCA")
@SequenceGenerator(name = "abrigo", sequenceName = "SQ_TAB_LUVA_SEURANCA", allocationSize = 1)
public class LuvaSeguranca {

    @Id
    @Column(name = "id_luva_seguranca")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "luva_seguranca")
    private Long id;

    private String marca;

    /*@Enumerated(EnumType.STRING)
    private TamanhoLuva tamanhoLuva;*/



}
