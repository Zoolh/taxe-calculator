package com.ceetiz.calculator.domain.repository;

import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.AbstractEntreprise;
import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.ChiffreAffaire;
import org.springframework.data.repository.CrudRepository;

public interface IEntrepriseRepository {

    public AbstractEntreprise getEntrepriseBySiret(String siret);

    public ChiffreAffaire getCaByYear(String siret, String annee);

}
