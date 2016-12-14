package com.mappipng.framework.Performance.mapper.mapstruct;

import com.mappipng.framework.Performance.dto.WorkerInfo;
import com.mappipng.framework.Performance.entity.Worker;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-14T16:12:00+0530",
    comments = "version: 1.0.0.Final, compiler: Eclipse JDT (IDE) 1.2.0.v20150514-0146, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class WorkerMapStructMapperImpl extends WorkerMapStructMapper {

    @Override
    public WorkerInfo workerToWorkerInfo(Worker worker) {
        if ( worker == null ) {
            return null;
        }

        WorkerInfo workerInfo = new WorkerInfo();

        workerInfo.setFirstEmail( emailFirstEmail( worker.getEmailList() ) );
        workerInfo.setCompanyName( companyToCompanyName( worker.getCompany() ) );
        workerInfo.setAddress( addressToString( worker.getAddress() ) );
        if ( worker.getBirthDate() != null ) {
            workerInfo.setBirthDate( new SimpleDateFormat( "dd/MM/yyyy" ).format( worker.getBirthDate() ) );
        }
        workerInfo.setSalary( worker.getSalary() );

        return workerInfo;
    }
}
