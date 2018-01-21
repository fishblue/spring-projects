package com.tencent.channel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * mybatis测试实体类
 * @author seasonzhou
 *
 */
@Entity
public class Greet {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String greetWords;
	
	public Greet() {
		
	}
	
	public Greet(Long id,String greetWords) {
		this.id = id;
		this.greetWords = greetWords;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGreetWords() {
		return greetWords;
	}
	public void setGreetWords(String greetWords) {
		this.greetWords = greetWords;
	}
}
