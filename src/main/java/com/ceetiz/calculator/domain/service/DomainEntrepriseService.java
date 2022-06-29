package com.ceetiz.calculator.domain.service;

import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.AbstractEntreprise;
import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.ChiffreAffaire;
import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.Type;
import com.ceetiz.calculator.domain.repository.IEntrepriseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class DomainEntrepriseService implements IEntrepriseService {

    private IEntrepriseRepository entrepriseRepository;

    @Autowired
    public DomainEntrepriseService(IEntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public int getTaxeAmount(String siret, String annee) {

        // Récupérer l'entreprise
        AbstractEntreprise entreprise = entrepriseRepository.getEntrepriseBySiret(siret);

        // Récupérer le CA pour année et entreprise donnée
        ChiffreAffaire ca = entrepriseRepository.getCaByYear(siret, annee);

        // Calculer
        return entreprise.calculTaxe(ca.getMontant());
    }
}
