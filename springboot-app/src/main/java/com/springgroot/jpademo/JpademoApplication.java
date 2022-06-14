package com.springgroot.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import software.amazon.codeguruprofilerjavaagent.Profiler;

@SpringBootApplication
@EnableJpaAuditing
public class JpademoApplication {

	public static void main(String[] args) {
		new Profiler.Builder()
		  .profilingGroupName("springbootfargate")
		  .build().start();
		SpringApplication.run(JpademoApplication.class, args);
	}

}
