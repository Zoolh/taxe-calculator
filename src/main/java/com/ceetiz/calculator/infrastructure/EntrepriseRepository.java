package com.ceetiz.calculator.infrastructure;

import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.AbstractEntreprise;
import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.ChiffreAffaire;
import com.ceetiz.calculator.domain.repository.IEntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EntrepriseRepository implements IEntrepriseRepository {

    private final ImportedEntrepriseRepository impl;

    @Autowired
    public EntrepriseRepository(final ImportedEntrepriseRepository impl) {
        this.impl = impl;
    }

    @Override
    public AbstractEntreprise getEntrepriseBySiret(String siret) {
        // Récupérer l'entreprise
        AbstractEntreprise result = impl.getBySiret(siret);

        // case entreprise.Type == Type.SAS alors j'instancie une SAS

        // case entreprise.Type == Type.AutoEntreprise alors j'instancie une Autoentreprise
        return null;
    }

    @Override
    public ChiffreAffaire getCaByYear(String siret, String annee) {
        
        return null;
    }
}
