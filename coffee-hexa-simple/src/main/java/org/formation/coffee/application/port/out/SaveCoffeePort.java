package org.formation.coffee.application.port.out;

import org.formation.coffee.domain.model.Coffee;

public interface SaveCoffeePort {

    /**
     * Enregistre un café nouveau ou existant
     */
    Coffee save(Coffee coffee);
}
