package com.tencent.channel.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tencent.channel.domain.Greet;

/**
 * jpa repository测试
 * @author seasonzhou
 * @version 1.0
 * @since 2018-01-12 16:42:11
 */
public interface GreetRepository extends JpaRepository<Greet, Long>{
	
	/**
	 * 
	 * @param greet 问候语
	 * @return
	 */
	Greet findByGreetWords(String greet);
	
	/**
	 * 
	 * @param greet 问候语
	 * @return
	 */
	@Query(" from Greet u where u.greetWords = :greet ")
	Greet findGreet(@Param("greet") String greet);
}
