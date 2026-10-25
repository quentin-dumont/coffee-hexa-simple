package org.formation.coffee.application.port.in;

import org.formation.coffee.domain.exception.CoffeeNotFoundException;
import org.formation.coffee.domain.model.Coffee;

public interface UpdateCoffeeUseCase {

    /**
     * @throws CoffeeNotFoundException
     */
    Coffee updateCoffee(UpdateCoffeeCommand command);
}
