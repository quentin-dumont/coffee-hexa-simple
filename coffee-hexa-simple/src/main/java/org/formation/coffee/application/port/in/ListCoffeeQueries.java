package org.formation.coffee.application.port.in;

import org.formation.coffee.domain.model.Coffee;

import java.util.List;

public interface ListCoffeeQueries {

    List<Coffee> listCoffees();
}
