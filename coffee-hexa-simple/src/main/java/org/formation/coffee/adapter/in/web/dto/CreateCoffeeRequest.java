package org.formation.coffee.adapter.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * On ne valide que la forme de la requête ici. Les règles métier sont checkées dans le domaine
 * @param name
 * @param price
 */
public record CreateCoffeeRequest(@NotBlank String name, @NotNull Integer price) {
}
