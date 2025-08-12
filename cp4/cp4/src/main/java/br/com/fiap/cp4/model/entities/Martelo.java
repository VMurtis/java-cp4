package br.com.fiap.cp4.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TAB_MARTELO")
@SequenceGenerator(name = "martelo", sequenceName = "SQ_TAB_MARTELO", allocationSize = 1)
public class Martelo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "martelo")
    @Column(name = "id_martelo")
    private Long id;


    private String marca;


    private Double peso;


    private String tipo;
}