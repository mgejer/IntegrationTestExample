package com.despegar.jav;

import com.despegar.jav.classB.ClassB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by martingejer on 31/03/19.
 */
@Component
public class ClassA {

	@Autowired
	private ClassB classB;

	@Autowired
	private ClassC classC;

	public Integer add() {
		return classB.getValue() + 100 + classC.getOtherValue();
	}
}
