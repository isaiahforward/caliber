package com.revature.caliber.test.tasks;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.support.CronTrigger;

import com.revature.caliber.CaliberTest;
import com.revature.caliber.Salesforce;
import com.revature.caliber.tasks.BatchUpdate;

public class BatchUpdateTest extends CaliberTest{
	
	/*
	 * Test Methods: Verifies cron trigger executions at midnight,
	 * 				 Checks the last time execution was fired and 
	 * 				 Shows the next execution date that trigger will be fired
	 */
	private static final Logger log = Logger.getLogger(BatchUpdate.class);
	@Test
	public void testScheduler() {
		org.springframework.scheduling.support.CronTrigger trigger = new CronTrigger("0 0 0 * * *");
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		final Date yesterday = today.getTime();
		String lastMessage = (sdf.format(yesterday)) + " : [Yesterday]";
		log.info(lastMessage);
		//System.out.println(lastMessage);
		Date nextExecution = trigger.nextExecutionTime(
				new TriggerContext() {
					@Override
					public Date lastScheduledExecutionTime() {
						return yesterday;
					}
					@Override
					public Date lastActualExecutionTime() {
						return yesterday;
					}
					@Override
					public Date lastCompletionTime() {
						return yesterday;
					}
				});
		String nextMessage = sdf.format(nextExecution) + " : [Execution] ";
		log.info(nextMessage);
		//System.out.println(nextMessage);
	}
}
