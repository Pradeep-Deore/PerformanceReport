package com.mappipng.framework.Performance.test.mapper;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import com.mappipng.framework.Performance.dto.WorkerInterface;
import com.mappipng.framework.Performance.enumeration.Company;

/**
 * @author Pradeep Deore
 */
public class AbstractWorkerMapperTest {

	protected void checkWorkerInfo(WorkerInterface workerInfo) throws ParseException {
		
		assertEquals(workerInfo.getAddress(), "Next Street 5th, 600119 Chennai");
		assertEquals(workerInfo.getBirthDate(), "17/07/1989");
		assertEquals(workerInfo.getCompanyName(), Company.CTS.getCompanyName());
		assertEquals(workerInfo.getFirstEmail(), "deorepradeep@gmail.com");
		assertEquals(workerInfo.getSalary(), new Double("6666.99"));
	}

}
