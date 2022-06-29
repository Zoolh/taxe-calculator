package com.ceetiz.calculator.domain.aggregator.entrepriseAggregate;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class ChiffreAffaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int montant;
    private String annee;
}
