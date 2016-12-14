package com.mappipng.framework.Performance.mapper.dozer.converter;

import org.dozer.DozerConverter;

import com.mappipng.framework.Performance.enumeration.Company;

/**
 * @author Pradeep Deore
 */
public class CompanyToCompanyName extends DozerConverter<Company, String> {

    public CompanyToCompanyName() {
        super(Company.class, String.class);
    }

    @Override
    public String convertTo(Company company, String s) {
        return company != null ? company.getCompanyName() : null;
    }

    @Override
    public Company convertFrom(String s, Company company) {
        throw new UnsupportedOperationException("Not supported conversion");
    }
}
