package com.mappipng.framework.Performance.mapper.dozer.converter;

import org.dozer.DozerConverter;

import com.mappipng.framework.Performance.entity.Address;

/**
 * @author Pradeep Deore
 */
public class AddressToStringConverter extends DozerConverter<Address, String> {

    public AddressToStringConverter() {
        super(Address.class, String.class);
    }

    @Override
    public String convertTo(Address address, String s) {
        if (address != null) {
            return address.getStreet() + ", " + address.getPostalCode() + " " + address.getCity();
        }
        return null;
    }

    @Override
    public Address convertFrom(String s, Address address) {
        throw new UnsupportedOperationException("Not supported conversion");
    }
}
