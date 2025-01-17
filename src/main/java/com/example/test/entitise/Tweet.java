package com.example.test.entitise;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tweets")
@Data
public class Tweet {
	
	@Id
	private String tid;
	
	private String author;
	
	private String contents;
	
}
