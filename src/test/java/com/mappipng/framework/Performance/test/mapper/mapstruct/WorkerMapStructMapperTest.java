package com.mappipng.framework.Performance.test.mapper.mapstruct;

import java.text.ParseException;

import org.junit.Test;

import com.mappipng.framework.Performance.Main;
import com.mappipng.framework.Performance.dto.WorkerInfo;
import com.mappipng.framework.Performance.entity.Worker;
import com.mappipng.framework.Performance.mapper.mapstruct.WorkerMapStructMapper;
import com.mappipng.framework.Performance.test.mapper.AbstractWorkerMapperTest;


/**
 * @author Pradeep Deore
 */
public class WorkerMapStructMapperTest extends AbstractWorkerMapperTest {

    @Test
    public void shouldMapWorkerToWorkerInfo() throws ParseException {
        //given
        Worker worker = Main.prepareWorker();

        //when
        WorkerInfo workerInfo = WorkerMapStructMapper.INSTANCE.workerToWorkerInfo(worker);

        //then
        checkWorkerInfo(workerInfo);
    }
}