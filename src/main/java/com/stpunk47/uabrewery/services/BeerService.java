package com.stpunk47.uabrewery.services;

import com.stpunk47.uabrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

}
