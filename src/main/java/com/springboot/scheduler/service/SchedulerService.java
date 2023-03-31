package com.springboot.scheduler.service;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.springboot.scheduler.model.Student;
import com.springboot.scheduler.repository.StudentDao;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class SchedulerService {

	@Autowired
	StudentDao studentDao;
	
	@Scheduled(cron="0/2 * * * * *")
	public void addStudent() {
		Student s = new Student();
		s.setName(String.valueOf(new Random().nextInt(1000)));
		log.info(s+" and Current time is "+new Date().toString());
		studentDao.save(s);

	}
	@Scheduled(cron="0/7 * * * * *")
	public void displayStudents() {
		log.info(" Current Time is "+new Date().toString());
		log.info(studentDao.findAll().toString());
	}

}
