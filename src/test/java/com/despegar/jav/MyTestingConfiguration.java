package com.despegar.jav;

import com.despegar.jav.classB.ClassB;
import com.despegar.jav.classB.ClassBMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by martingejer on 31/03/19.
 */
@ComponentScan(basePackages = "com.despegar.jav")
public class MyTestingConfiguration {

	@Configuration
	public class TheConfiguration {
		@Bean
		public ClassB getClassB() {
			return new ClassBMock();
		}
	}
}
