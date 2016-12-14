package com.mappipng.framework.Performance.enumeration;

/**
 * @author Pradeep Deore
 */
public enum Company {

    CTS("CTS"),
    TCS("TCS"),
    INFOSYS("INFOSYS"),
    GEOMETERICS("GEOMETERICS"),
    WIPRO("WIPRO");

    private String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
