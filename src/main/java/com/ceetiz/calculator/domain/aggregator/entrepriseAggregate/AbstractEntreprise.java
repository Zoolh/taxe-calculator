package com.ceetiz.calculator.domain.aggregator.entrepriseAggregate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_ENTITE")
@DiscriminatorValue("ENTREPRISE")
public abstract class AbstractEntreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String siret;
    private String denomination;
    @OneToMany
    private ChiffreAffaire chiffreAffaire;
    @ManyToOne
    private Type typeEntreprise;

    public abstract int calculTaxe(int chiffreAffaire);
}
