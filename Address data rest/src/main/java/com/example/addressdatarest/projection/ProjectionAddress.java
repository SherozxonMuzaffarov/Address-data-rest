package com.example.addressdatarest.projection;

import com.example.addressdatarest.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface ProjectionAddress {

    Integer getId();

    String getCity();

    String getStreet();

}
