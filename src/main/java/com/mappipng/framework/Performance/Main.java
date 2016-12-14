package com.mappipng.framework.Performance;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.mappipng.framework.Performance.dto.WorkerInfo;
import com.mappipng.framework.Performance.entity.Address;
import com.mappipng.framework.Performance.entity.Worker;
import com.mappipng.framework.Performance.enumeration.Company;
import com.mappipng.framework.Performance.mapper.dozer.WorkerDozerMapper;
import com.mappipng.framework.Performance.mapper.mapstruct.WorkerMapStructMapper;

/**
 * @author Pradeep Deore
 */

public class Main {

    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(Main.class.getName());
    private static final int NUMBER_OF_MAPPINGS = 140000;
    private static final NumberFormat formatter = new DecimalFormat("#0.00000");

    public static void main( String[] args ) throws ParseException {
        List<Worker> entitiesList = generateEntitiesList();
        mapWithMapStruct(entitiesList);
        mapWithDozer(entitiesList);
    }

    private static List<Worker> generateEntitiesList() throws ParseException {
        log.info("Preparing sample data...");
        List<Worker> entitiesList = new ArrayList<Worker>(NUMBER_OF_MAPPINGS);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= NUMBER_OF_MAPPINGS; i++) {
            entitiesList.add(prepareWorker());
        }
        long endTime = System.currentTimeMillis();
        log.info("Done preparing sample data in " + formatter.format((endTime - startTime) / 1000d) + " seconds");
        return entitiesList;
    }

    private static List<WorkerInfo> mapWithDozer(List<Worker> entitiesList) {
        log.info("Start mapping with Dozer...");
        WorkerDozerMapper workerDozerMapper = new WorkerDozerMapper();
        List<WorkerInfo> dtoList = new ArrayList<WorkerInfo>(NUMBER_OF_MAPPINGS);
        long startTime = System.currentTimeMillis();
        for (Worker worker : entitiesList) {
            dtoList.add(workerDozerMapper.workerToWorkerInfo(worker));
        }
        long endTime = System.currentTimeMillis();
        log.info("Mapping with Dozer done in " + formatter.format((endTime - startTime) / 1000d) + " seconds");
        return dtoList;
    }

    private static List<WorkerInfo> mapWithMapStruct(List<Worker> entitiesList) {
        log.info("Start mapping with MapStruct...");
        List<WorkerInfo> dtoList = new ArrayList<WorkerInfo>(NUMBER_OF_MAPPINGS);
        long startTime = System.currentTimeMillis();
        for (Worker worker : entitiesList) {
            dtoList.add(WorkerMapStructMapper.INSTANCE.workerToWorkerInfo(worker));
        }
        long endTime = System.currentTimeMillis();
        log.info("Mapping with MapStruct done in " + formatter.format((endTime - startTime) / 1000d) + " seconds");
        return dtoList;
    }

    public static Worker prepareWorker() throws ParseException {
        Worker worker = new Worker();
        worker.setCompany(Company.CTS);
        worker.setEmailList(Arrays.asList("deorepradeep@gmail.com", "pradeepdeore@fb.com"));
        worker.setSalary(6666.99);
        Address address = new Address();
        address.setCity("Chennai");
        address.setPostalCode("600119");
        address.setStreet("Next Street 5th");
        worker.setAddress(address);
        SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");

        Date date1 = dateformat3.parse("17/07/1989");

        worker.setBirthDate(date1);
        worker.setId(new BigInteger("987456"));
        worker.setName("Pradeep");
        worker.setSurname("Deore");
        return worker;
    }
}