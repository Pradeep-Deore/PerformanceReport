package com.mappipng.framework.Performance.mapper.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.mappipng.framework.Performance.dto.WorkerInfo;
import com.mappipng.framework.Performance.dto.WorkerInfoImmutable;
import com.mappipng.framework.Performance.entity.Worker;

/**
 *  @author Pradeep Deore
 */
public class WorkerDozerMapper {

    private final DozerBeanMapper mapper = new DozerBeanMapper();

    public WorkerDozerMapper() {
        List<String> myMappingFiles = new ArrayList<String>();
        myMappingFiles.add("dozer/globalConfiguration.xml");
        myMappingFiles.add("dozer/workerToWorkerInfo.xml");
        myMappingFiles.add("dozer/workerToWorkerInfoImmutable.xml");
        mapper.setMappingFiles(myMappingFiles);
    }

    public WorkerInfo workerToWorkerInfo(Worker worker) {
        return mapper.map(worker, WorkerInfo.class);
    }

    public WorkerInfoImmutable workerToWorkerInfoImmutable(Worker worker) {
        return mapper.map(worker, WorkerInfoImmutable.class);
    }
}
