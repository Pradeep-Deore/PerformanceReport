package com.mappipng.framework.Performance.mapper.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.mappipng.framework.Performance.dto.WorkerInfo;
import com.mappipng.framework.Performance.entity.Address;
import com.mappipng.framework.Performance.entity.Worker;
import com.mappipng.framework.Performance.enumeration.Company;

/**
 * @author Pradeep Deore
 */
@Mapper
public abstract class WorkerMapStructMapper {

    public static final WorkerMapStructMapper INSTANCE = Mappers.getMapper(WorkerMapStructMapper.class);

   @Mappings({ @Mapping(target = "birthDate", dateFormat = "dd/MM/yyyy"),
    @Mapping(source = "company", target = "companyName"),
    @Mapping(source = "emailList", target = "firstEmail")})
    public abstract WorkerInfo workerToWorkerInfo(Worker worker);

    public String addressToString(Address address) {
        return address.getStreet() + ", " + address.getPostalCode() + " " + address.getCity();
    }

    protected String companyToCompanyName(Company company) {
        return company != null ? company.getCompanyName() : null;
    }

    protected String emailFirstEmail(List<String> emailList) {
        return emailList != null && !emailList.isEmpty() ? emailList.get(0) : null;
    }
}
