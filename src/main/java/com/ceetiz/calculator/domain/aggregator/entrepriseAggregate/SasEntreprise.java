package com.ceetiz.calculator.domain.aggregator.entrepriseAggregate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("SAS")
public class SasEntreprise extends AbstractEntreprise{

    private Adresse adresseSiege;


    @Override
    public int calculTaxe(int chiffreAffaire) {
        // 33% du CA Annuel
        return 0;
    }
}
