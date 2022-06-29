package com.ceetiz.calculator.infrastructure;

import com.ceetiz.calculator.domain.aggregator.entrepriseAggregate.AbstractEntreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ImportedEntrepriseRepository extends CrudRepository<AbstractEntreprise, Long> {

    AbstractEntreprise getBySiret(String siret);

}
