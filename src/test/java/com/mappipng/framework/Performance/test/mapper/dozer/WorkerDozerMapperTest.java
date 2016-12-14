package com.mappipng.framework.Performance.test.mapper.dozer;

import java.text.ParseException;

import org.junit.Test;

import com.mappipng.framework.Performance.Main;
import com.mappipng.framework.Performance.dto.WorkerInfo;
import com.mappipng.framework.Performance.dto.WorkerInfoImmutable;
import com.mappipng.framework.Performance.entity.Worker;
import com.mappipng.framework.Performance.mapper.dozer.WorkerDozerMapper;
import com.mappipng.framework.Performance.test.mapper.AbstractWorkerMapperTest;
/**
 * @author Pradeep Deore
 */
public class WorkerDozerMapperTest extends AbstractWorkerMapperTest {

    private final WorkerDozerMapper workerDozerMapper = new WorkerDozerMapper();

    @Test
    public void shouldMapWorkerToWorkerInfo() throws ParseException {
        //given
        Worker worker = Main.prepareWorker();

        //when
        WorkerInfo workerInfo = workerDozerMapper.workerToWorkerInfo(worker);

        //then
        checkWorkerInfo(workerInfo);
    }

    @Test
    public void shouldMapWorkerToWorkerInfoImmutable() throws ParseException {
        //given
        Worker worker = Main.prepareWorker();

        //when
        WorkerInfoImmutable workerInfo = workerDozerMapper.workerToWorkerInfoImmutable(worker);

        //then
        checkWorkerInfo(workerInfo);
    }
}