package com.revature.caliber.gateway.services.impl;

<<<<<<< HEAD
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.revature.caliber.beans.Week;
import com.revature.caliber.gateway.services.impl.TrainingServiceImpl;

public class TrainingServiceImplTest {
	
	@Test
	@Ignore
	public void getAllWeekTest(){
		
		TrainingServiceImpl training = new TrainingServiceImpl();
		List<Week> weeks = training.getAllWeek();
		System.out.println(weeks);
	}
	
	@Test
	@Ignore
	public void addNewWeekTest(){
		Week newWeek = new Week();
		newWeek.setWeekNumber(2099);
		TrainingServiceImpl training = new TrainingServiceImpl();
		training.createWeek(newWeek);
	}


}
=======
import com.revature.caliber.beans.Batch;
import com.revature.caliber.beans.Tier;
import com.revature.caliber.beans.Trainer;
import com.revature.caliber.gateway.services.TrainingService;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by louislopez on 1/25/17.
 */

public class TrainingServiceImplTest {
    @Test
    @Ignore
    public void currentBatch() throws Exception {
        //Goes to - > training/batch/current/1
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/beans.xml");
        TrainingServiceImpl ts = (TrainingServiceImpl) context.getBean("trainingService");
        ts.setHostname("http://localhost:");
        ts.setPortNumber("8080");
        System.err.println( ts.currentBatch(1));
    }

    @Test
    @Ignore
    public void getBatch() throws Exception {
        //Goes to - > training/batch/byId/3
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/beans.xml");
        TrainingServiceImpl ts = (TrainingServiceImpl) context.getBean("trainingService");
        ts.setHostname("http://localhost:");
        ts.setPortNumber("8080");
        Batch batch = ts.getBatch(3);
        System.err.println(batch.toString());
    }


    @Test
    @Ignore
    public void updateBatch() throws Exception {
        //Goes to - > training/batch/update ... needs json body
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/beans.xml");
        TrainingServiceImpl ts = (TrainingServiceImpl) context.getBean("trainingService");
        ts.setHostname("http://localhost:");
        ts.setPortNumber("8080");
        Batch batch = ts.getBatch(1);
        System.err.println(batch.toString());
        batch.setTrainingName("angular4");
        ts.updateBatch(batch);
        System.out.println("Updated batch -> " + ts.getBatch(1));
    }

//    @Test
//    public void deleteBatch() throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/beans.xml");
//        TrainingServiceImpl ts = (TrainingServiceImpl) context.getBean("trainingService");
//        Batch batch = ts.getBatch(6550);
//        ts.deleteBatch(batch);
//    }

}
>>>>>>> c270f12ed4504ef5cd2e742eb1d73c1c3f40c345
