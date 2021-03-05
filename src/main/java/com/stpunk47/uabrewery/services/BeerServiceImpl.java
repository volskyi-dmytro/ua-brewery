package com.stpunk47.uabrewery.services;

import com.stpunk47.uabrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Pavlivske")
                .beerStyle("Svitle")
                .build();

    }
}
