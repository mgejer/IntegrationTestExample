package com.despegar.jav;

import com.despegar.jav.classB.ClassB;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

/**
 * Created by martingejer on 31/03/19.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {MyConfiguration.class})
public class TestA {

	@Autowired
	private ClassA classA;

	@MockBean
	private ClassB someClassB;

	@MockBean
	private ClassC someClassC;

	@Before
	public void setup() {
		when(someClassB.getValue()).thenReturn(500);
		when(someClassC.getOtherValue()).thenReturn(1000);
	}

	@Test
	public void testA() {
		assert classA.add() == 1600;
	}
}
