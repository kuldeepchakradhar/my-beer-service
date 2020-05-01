package com.mybeerserive.io.mybeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerDto {

    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime modifiedDate;

    private String beerName;
    private BeerStyleEnum beerStyle;

    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;

}