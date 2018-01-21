package com.tencent.channel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.tencent.channel.dao.repository.GreetRepository;
import com.tencent.channel.domain.Greet;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChannelApplicationTests {

	@Autowired
	private GreetRepository greetDao;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void repositoryTest() {
		greetDao.count();
		Greet greet = greetDao.save(new Greet(1L,"name"));
		assertThat(greetDao.findOne(1L).getGreetWords().equals(greet.getGreetWords()));
	}
}
