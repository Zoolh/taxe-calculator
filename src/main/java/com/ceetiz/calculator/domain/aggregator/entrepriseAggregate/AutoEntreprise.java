package com.ceetiz.calculator.domain.aggregator.entrepriseAggregate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("AUTOENTREPRISE")
public class AutoEntreprise extends AbstractEntreprise{


    @Override
    public int calculTaxe(int chiffreAffaire) {
        // 25% du CA Annuel
        return 0;
    }
}
