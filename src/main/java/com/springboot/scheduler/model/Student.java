package com.springboot.scheduler.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class Student {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
}
