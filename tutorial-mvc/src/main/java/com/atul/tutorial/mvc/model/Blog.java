package com.atul.tutorial.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="blog")
public class Blog {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	
	private String description;
	
	private String code;
	
	

}
