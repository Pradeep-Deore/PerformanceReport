package com.mappipng.framework.Performance.dto;

/**
 * @author Pradeep Deore
 */
public class WorkerInfoImmutable implements WorkerInterface {

    private String firstNameAndSurname;
    /* Format: YYYYMMDD */
    private String birthDate;
    private String address;
    private String companyName;
    private String firstEmail;
    private Double salary;

    /**
     * This constructor is required by Dozer for mapping.
     */
    public WorkerInfoImmutable() {
    }

    public WorkerInfoImmutable(String firstNameAndSurname, String birthDate, String address, String companyName, String firstEmail, Double salary) {
        this.firstNameAndSurname = firstNameAndSurname;
        this.birthDate = birthDate;
        this.address = address;
        this.companyName = companyName;
        this.firstEmail = firstEmail;
        this.salary = salary;
    }

	/**
	 * @return the firstNameAndSurname
	 */
	public String getFirstNameAndSurname() {
		return firstNameAndSurname;
	}

	/**
	 * @param firstNameAndSurname the firstNameAndSurname to set
	 */
	public void setFirstNameAndSurname(String firstNameAndSurname) {
		this.firstNameAndSurname = firstNameAndSurname;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the firstEmail
	 */
	public String getFirstEmail() {
		return firstEmail;
	}

	/**
	 * @param firstEmail the firstEmail to set
	 */
	public void setFirstEmail(String firstEmail) {
		this.firstEmail = firstEmail;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
}
